package com.elta.my_spring;

import lombok.SneakyThrows;

import java.lang.invoke.SerializedLambda;

/**
 * @author Evgeny Borisov
 */
public enum ObjectFactory {

    INSTANCE;

    private Config config = new JavaConfig();

    private ObjectFactory() {
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            Class<T> implClass = (Class<T>) config.getImplClass(type);

            type = implClass;
        }


        T t = type.getDeclaredConstructor().newInstance();

        //todo write support for @InjectRandomInt

        return t;

    }
}
