package com.elta.my_spring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public enum ObjectFactory {

    INSTANCE;

    private Config config = new JavaConfig();
    private Reflections scanner = new Reflections("com.elta");

    private ObjectFactory() {
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        type = resolveImpl(type);

        T t = create(type);

        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
                int value = random.nextInt(max - min) + min;

                field.setAccessible(true);
                field.set(t,value);

            }
        }


        //todo write support for @InjectRandomInt

        return t;

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
                type = (Class<T>) classes.iterator().next();
            }
            type = implClass;
        }
        return type;
    }
}
