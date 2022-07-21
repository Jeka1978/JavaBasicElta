package com.elta.my_spring;

/**
 * @author Evgeny Borisov
 */
public class EltaServiceImpl implements EltaService {
    @Override
    public void work() {
        System.out.println("Working in Elta");
    }

    @Override
    @Benchmark
    public void drinkBeer() {
        System.out.println("Leff is good beer");
    }
}
