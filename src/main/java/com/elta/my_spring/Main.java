package com.elta.my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
//        IRobot iRobot = ObjectFactory.INSTANCE.createObject(IRobot.class);
//        iRobot.cleanRoom();

        EltaService eltaService = ObjectFactory.INSTANCE.createObject(EltaService.class);
//        eltaService.drinkBeer();
        eltaService.work();
        System.out.println(eltaService.getClass());

        //use CGLIB
      /*  NayaService nayaService = ObjectFactory.INSTANCE.createObject(NayaService.class);
        nayaService.c();
        System.out.println(nayaService.getClass());*/


    }
}
