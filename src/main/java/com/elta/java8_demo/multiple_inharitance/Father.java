package com.elta.java8_demo.multiple_inharitance;

/**
 * @author Evgeny Borisov
 */
public interface Father {

    public static final String NAME="WWW";


   default void talkToChildren(){
       System.out.println("Children go home");
   }
}
