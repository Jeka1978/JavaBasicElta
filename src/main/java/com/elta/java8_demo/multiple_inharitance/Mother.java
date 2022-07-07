package com.elta.java8_demo.multiple_inharitance;

/**
 * @author Evgeny Borisov
 */
public interface Mother {
   default void talkToChildren(){
       System.out.println("CHILDREN GO HOME!!!");
   }
}
