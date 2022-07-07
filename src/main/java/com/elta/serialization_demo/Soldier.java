package com.elta.serialization_demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.TreeSet;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Soldier implements Serializable {
    private static final long serialVersionUID =13;

    private String name;


    private transient int age=17;




    {
        System.out.println("Soldier");




    }



}
