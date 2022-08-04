package com.elta.never_use_switch_lab;

/**
 * @author Evgeny Borisov
 */
public interface DistributionService {
    void sendMessage(Message message);

    //todo add new interface for MessageProvider
//    which will generate and send random messages
    // write to impl (fast provider - will send messages each second, slow provider - each 5 seconds)
}
