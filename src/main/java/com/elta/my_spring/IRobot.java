package com.elta.my_spring;

import java.rmi.dgc.DGC;

/**
 * @author Evgeny Borisov
 */
public class IRobot {

    private Speaker speaker = ObjectFactory.INSTANCE.createObject(Speaker.class);
    private Cleaner cleaner = ObjectFactory.INSTANCE.createObject(Cleaner.class);

    public void cleanRoom() {
        speaker.say("I started");
        cleaner.clean();
        speaker.say("I finished");
    }
}
