package com.elta.java8_demo.multiple_inharitance;

/**
 * @author Evgeny Borisov
 */
public class Superman implements Mother,Father{
    @Override
    public void talkToChildren() {
        Father.super.talkToChildren();
        Mother.super.talkToChildren();
    }
}
