package com.elta.real_spring;

import lombok.Setter;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class TerminatorQuoter implements Quoter {
    @Setter
    private List<String> messages = List.of("akjhdkajs","adjahd");

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }
}
