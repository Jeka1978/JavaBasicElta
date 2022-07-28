package com.elta.real_spring;

import com.elta.my_spring.InjectRandomInt;
import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class ShakespearQuoter implements Quoter {
    @Setter
    private String message;
    @InjectRandomInt(min = 3, max = 7)
    private int repeat = 0;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
