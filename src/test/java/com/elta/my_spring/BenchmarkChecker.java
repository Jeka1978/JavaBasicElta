package com.elta.my_spring;

import lombok.Getter;

/**
 * @author Evgeny Borisov
 */
@Getter
class BenchmarkChecker {

    private int countBenchmarkWhenNeeded;
    private int countBenchmarkWhenNoNeeded;


    @Benchmark
    public void doWithBenchmark() {
        countBenchmarkWhenNeeded++;
    }

    public void doWithoutBenchmark() {
        countBenchmarkWhenNoNeeded++;
    }

}
