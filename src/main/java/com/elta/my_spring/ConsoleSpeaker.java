package com.elta.my_spring;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class ConsoleSpeaker implements Speaker {
    @Override
    public void say(String message) {
        System.out.println(message);
    }


    public static void main(String[] args) {
        Speaker object = ObjectFactory.INSTANCE.createObject(Speaker.class);
        Speaker object1 = ObjectFactory.INSTANCE.createObject(Speaker.class);
        Speaker object2 = ObjectFactory.INSTANCE.createObject(Speaker.class);
        Speaker object3 = ObjectFactory.INSTANCE.createObject(Speaker.class);
        //chech it is the same object
    }
}
