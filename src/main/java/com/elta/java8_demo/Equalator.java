package com.elta.java8_demo;

/**
 * @author Evgeny Borisov
 */
public interface Equalator<T> {
    boolean equals(T t1, T t2);
}
