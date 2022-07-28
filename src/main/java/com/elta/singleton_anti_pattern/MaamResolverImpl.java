package com.elta.singleton_anti_pattern;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class MaamResolverImpl implements MaamResolver {
    private double maam;


    public MaamResolverImpl() {
        maam = getMaamFromWebService();
    }

    @SneakyThrows
    private double getMaamFromWebService() {
        Thread.sleep(3500);
        return 0.18;
    }

    @Override
    public double getMaam(){
        return maam;
    }



}
