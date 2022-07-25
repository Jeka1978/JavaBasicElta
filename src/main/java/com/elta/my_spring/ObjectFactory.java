package com.elta.my_spring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import javax.annotation.PostConstruct;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public enum ObjectFactory {


    INSTANCE;

    private Config config = new JavaConfig();
    private Reflections scanner = new Reflections("com.elta");

    private List<ObjectConfigurator> objectConfigurators = new ArrayList<>();
    private List<ProxyConfigurator> proxyConfigurators = new ArrayList<>();

    @SneakyThrows
    private ObjectFactory() {
        Set<Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                objectConfigurators.add(aClass.getDeclaredConstructor().newInstance());
            }
        }

        Set<Class<? extends ProxyConfigurator>> proxyConfiguratorClasses = scanner.getSubTypesOf(ProxyConfigurator.class);
        for (Class<? extends ProxyConfigurator> proxyConfiguratorClass : proxyConfiguratorClasses) {
            if (!Modifier.isAbstract(proxyConfiguratorClass.getModifiers())) {
                proxyConfigurators.add(proxyConfiguratorClass.getDeclaredConstructor().newInstance());
            }
        }


    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {


        type = resolveImpl(type);

        T t = create(type);

        configure(t);

        invokeInitMethods(type, t);

        t = repaceWithProxyIfNeeded(type, t);

        return t;

    }

    private <T> T repaceWithProxyIfNeeded(Class<T> type, T t) {
        for (ProxyConfigurator proxyConfigurator : proxyConfigurators) {
            t = (T) proxyConfigurator.replaceWithProxyIfNeeded(t, type);
        }
        return t;
    }

    private <T> void invokeInitMethods(Class<T> type, T t) throws IllegalAccessException, InvocationTargetException {
        Method[] methods = type.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(PostConstruct.class)){
                method.setAccessible(true);
                method.invoke(t);
            }
        }
    }

    private <T> void configure(T t) {
        objectConfigurators.forEach(objectConfigurator -> objectConfigurator.configure(t));
    }

    private <T> T create(Class<T> type) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        T t = type.getDeclaredConstructor().newInstance();
        return t;
    }

    private <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            Class<T> implClass = (Class<T>) config.getImplClass(type);
            if (implClass == null) {
                Set<Class<? extends T>> classes = scanner.getSubTypesOf(type);
                if (classes.size() != 1) {
                    throw new IllegalStateException("0 or more than 1 impl of " + type + " was found, please update your config");
                }
                implClass = (Class<T>) classes.iterator().next();
            }
            type = implClass;
        }
        return type;
    }
}
