package com.elta.never_use_switch_lab;

/**
 * @author Evgeny Borisov
 */

    //sms - to send by sms
    // whsp - send bt whatsapp
    // face - send by facebook
    // meta - will delegate to all meta beans the message
public class Message {
    private String text;
    private int deliveryType;
}
