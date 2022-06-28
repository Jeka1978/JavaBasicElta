package com.elta.demo1;

/**
 * @author Evgeny Borisov
 */
public class Hello {

    public static void main(String[] args) {


        Person person = Person.builder()
                .name("Maor")
                .age(12)
                .salary(1000)
                .beer("Tuborg", 1)
                .beer("Leff", 3)
                .oneFish("carpion")
                .build();
        System.out.println("person = " + person);


    }


    public int square(int x) {
        return x * x;
    }
}
