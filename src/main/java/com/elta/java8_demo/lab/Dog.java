package com.elta.java8_demo.lab;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("au au");
    }
}
