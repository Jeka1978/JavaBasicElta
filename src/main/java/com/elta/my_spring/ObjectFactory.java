package com.elta.my_spring;

/**
 * @author Evgeny Borisov
 */
public enum ObjectFactory {

    INSTANCE;

    private ObjectFactory() {
    }

    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {

        }

        return null;

    }
}
