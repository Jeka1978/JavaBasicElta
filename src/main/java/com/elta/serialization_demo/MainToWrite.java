package com.elta.serialization_demo;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Evgeny Borisov
 */
public class MainToWrite {
    @SneakyThrows
    public static void main(String[] args) {
        Soldier jack = new Soldier("Jack", 40);
        File file = new File("c:\\tmp\\soldier.obj");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(jack);
    }
}
