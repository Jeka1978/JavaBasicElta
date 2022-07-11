package com.elta.java8_demo;

import java.util.Comparator;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Hobbit {

    private String name;

    public void printName() {
        System.out.println(name);
    }

  /*  public static void printName(Hobbit hobbit) {
        System.out.println(hobbit.name);
    }*/


    public static void main(String[] args) {
        List<Hobbit> hobbits = List.of(new Hobbit());

        hobbits.forEach(Hobbit::printName);


        Comparator<Integer> comparator = Integer::compareTo;

    }
}







