package com.elta.reflections_demo;

import com.elta.enum_games.Person;
import com.elta.my_spring.InjectRandomInt;
import lombok.SneakyThrows;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class ObjectAnalyzer {


    public static void main(String[] args) {
        ObjectAnalyzer analyzer = new ObjectAnalyzer();
        analyzer.runAllTests("com.elta.reflections_demo.Test1");
    }

    @SneakyThrows
    public void runAllTests(String className) {
        Class<?> clazz = Class.forName(className);
        runAllTests(clazz);
    }

    @SneakyThrows
    public void runAllTests(Class<?> clazz) {
        Object o = clazz.getDeclaredConstructor().newInstance();
        runTestMethods(o);
    }


    @SneakyThrows
    public void runTestMethods(Object o){
        Method[] declaredMethods = o.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.getName().toLowerCase().contains("test")|| method.isAnnotationPresent(RunThisMethod.class)) {
                method.invoke(o);
            }
        }
    }

    public static void printMetadata(Object o) {
        Class<?> clazz = o.getClass();
        System.out.println(clazz.getName());
        Method[] methods = clazz.getMethods();
        System.out.println("methods: ");
        Arrays.stream(methods).forEach(System.out::println);
        System.out.println("**************: ");

        Method[] declaredMethods = clazz.getDeclaredMethods();
        System.out.println("declared methods: ");
        Arrays.stream(declaredMethods).forEach(System.out::println);
        System.out.println("*******************");

    }
}
