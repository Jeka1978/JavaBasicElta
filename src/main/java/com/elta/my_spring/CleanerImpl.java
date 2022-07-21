package com.elta.my_spring;

/**
 * @author Evgeny Borisov
 */
public class CleanerImpl implements Cleaner {
    @InjectRandomInt(min = 3, max = 6)
    private int repeat;

    //todo make this method run in the beginning, but after object was configured and all was injected

    public void init() {
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVVVVVVvvvvvvvvvvvvvvvvv");
        }
    }
}
