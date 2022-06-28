package com.elta.demo1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class HelloTest {

    @Test
    public void square() {
        Hello hello = new Hello();
        int answer = hello.square(5);
        Assert.assertEquals(25, answer);
    }
}