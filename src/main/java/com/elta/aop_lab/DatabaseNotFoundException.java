package com.elta.aop_lab;

/**
 * @author Evgeny Borisov
 */
public class DatabaseNotFoundException extends RuntimeException {
    public DatabaseNotFoundException(String message) {
        super(message);
    }
}
