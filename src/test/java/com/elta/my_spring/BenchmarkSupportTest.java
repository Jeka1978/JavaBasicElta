package com.elta.my_spring;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkSupportTest {


    @Test
    public void testBenchmarkIsWorkingPerMethod() {
        BenchmarkChecker checker = ObjectFactory.INSTANCE.createObject(BenchmarkChecker.class);
        checker.doWithoutBenchmark();
        checker.doWithoutBenchmark();
        checker.doWithoutBenchmark();
        Assert.assertEquals("benchmark not working", 3, checker.getCountBenchmarkWhenNeeded());
        checker.doWithoutBenchmark();
        checker.doWithoutBenchmark();
        checker.doWithoutBenchmark();
        Assert.assertEquals("benchmark working when not needed", 0, checker.getCountBenchmarkWhenNeeded());
    }
}