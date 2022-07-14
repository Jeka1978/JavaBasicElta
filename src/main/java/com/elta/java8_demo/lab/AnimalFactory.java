package com.elta.java8_demo.lab;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class AnimalFactory {
    private List<Animal> suppliers = List.of(new Horse(), () -> new Cat(),Dog::new);

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.suppliers.get(0);
        animal.makeVoice();
        Animal animal1 = animalFactory.suppliers.get(1);
        animal1.makeVoice();


    }


    /*public Animal createRandomAnimal() {
        //todo finish this
        Random random = new Random();
        int i = random.nextInt(suppliers.size());

        Map<Integer, Integer> map = Map.of(1, 1);

        return suppliers.get(i).get();
    }*/







}
