package com.elta.my_spring;

import lombok.SneakyThrows;

import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Field;
import java.util.Random;

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
}
