package com.elta.my_spring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ElfTest {

    @Test
    public void testInjectRandomIntIsWorking() {
        Elf elf = ObjectFactory.INSTANCE.createObject(Elf.class);
        System.out.println(elf);
        assertNotEquals(0, elf.getPower());
        assertNotEquals(0, elf.getSpeed());
    }
}