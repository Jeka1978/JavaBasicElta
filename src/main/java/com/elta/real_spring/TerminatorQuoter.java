package com.elta.real_spring;

import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
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

    public void killAll(){
        System.out.println("you are terminated...");
    }




}
