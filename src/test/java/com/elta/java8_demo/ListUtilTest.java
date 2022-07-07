package com.elta.java8_demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtilTest {

    @Test
    public void countDuplicates() {
        List<String> list = List.of("java", "JAVA", "JaVa", "scala");


        int amount = ListUtil.countDuplicates("java", list, (s, anotherString) -> s.equalsIgnoreCase(anotherString));
        Assert.assertEquals(3, amount);
    }
}