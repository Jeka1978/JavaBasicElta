package com.elta.my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
public class EltaServiceImpl implements EltaService {
    private EltaService eltaService;

    @Override
    public void work() {
        System.out.println("Working in Elta");
        this.drinkBeer();
    }

    @Override
    @Benchmark
    public void drinkBeer() {
        System.out.println("Leff is good beer");
    }

    @PostConstruct
    @Benchmark
    public void init(){
        System.out.println("init");
    }
}
