package com.elta.real_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.close();
        System.out.println();
    }
}
