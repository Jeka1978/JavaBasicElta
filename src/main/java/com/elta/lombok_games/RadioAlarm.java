package com.elta.lombok_games;

import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
public class RadioAlarm implements Radio,Alarm{

    @Delegate(excludes = RadioAlarmExclusions.class)
    private Alarm alarm = new AlarmImpl();
    @Delegate
    private Radio radio = new RadioImpl();


    static {
        System.out.println(2132);
    }


    public void c(){
        alarm.c();
    }

    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.a();
        radioAlarm.c();
    }

}
