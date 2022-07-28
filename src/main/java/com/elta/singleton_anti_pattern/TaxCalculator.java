package com.elta.singleton_anti_pattern;

import lombok.AccessLevel;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public class TaxCalculator {


    @Autowired
    @Setter(AccessLevel.PROTECTED)
    private MaamResolver maamResolver;

    public double withMaam(double price) {
        return maamResolver.getMaam() * price +price;
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        double withMaam = taxCalculator.withMaam(100);
        System.out.println("withMaam = " + withMaam);
    }
}
