package com.elta.serialization_demo;

import lombok.SneakyThrows;

import java.io.*;

/**
 * @author Evgeny Borisov
 */
public class MainToRead {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("c:\\tmp\\soldier.obj");

        FileInputStream fos = new FileInputStream(file);
        ObjectInputStream oos = new ObjectInputStream(fos);
        Soldier object = (Soldier) oos.readObject();
        System.out.println("object = " + object);
    }
}
