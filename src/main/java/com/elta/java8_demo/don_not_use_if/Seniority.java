package com.elta.java8_demo.don_not_use_if;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */

@RequiredArgsConstructor
public enum Seniority {
    JUNIOR(Integer.MIN_VALUE, 14), MIDDLE(14, 21), SENIOR(21, Integer.MAX_VALUE);

    private final int min;
    private final int max;


    public static Seniority bySalary(int salary) {
        return Arrays.stream(values())
                .filter(seniority -> seniority.min <= salary)
                .filter(seniority -> seniority.max > salary)
                .findAny().get();
    }


}



