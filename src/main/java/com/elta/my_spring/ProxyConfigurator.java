package com.elta.my_spring;

/**
 * @author Evgeny Borisov
 */
public interface ProxyConfigurator {
    Object replaceWithProxyIfNeeded(Object t,Class<?> type);

}
