package com.elta.reflections_demo;

/**
 * @author Evgeny Borisov
 */
public class Test1 {

    public Test1() {
        System.out.println("test object was created and configured for specific test");
    }

    @RunThisMethod
    public void runThisMethod() {
        System.out.println("!11111!");
    }

    public void test2() {
        System.out.println("!22222!");
    }


    public void help() {
        System.out.println("help");
    }
}
