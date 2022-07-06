package com.elta.my_spring;

/**
 * @author Evgeny Borisov
 */
public interface Config {
    Class<?> getImplClass(Class<?> type);
}
