package com.elta.my_spring;

import java.rmi.dgc.DGC;

/**
 * @author Evgeny Borisov
 */
public class IRobot {

    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    private String name;

    public void cleanRoom() {
        speaker.say("I started");
        cleaner.clean();
        speaker.say("I finished");
    }
}
