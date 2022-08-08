package com.elta.aop_lab;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class EltaProductDao {
    public void saveAll() {
        System.out.println("saving...");
        throw new DatabaseNotFoundException("fire all dba!");
    }
}
