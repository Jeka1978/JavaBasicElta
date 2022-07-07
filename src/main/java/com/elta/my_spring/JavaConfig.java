package com.elta.my_spring;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class JavaConfig implements Config {


    private Map<Class<?>, Class<?>> map = Map.of(
            Speaker.class, ConsoleSpeaker.class);



    public  Class<?> getImplClass(Class<?> type) {
        return map.get(type);
    }
}
