package com.elta.enum_games;

/**
 * @author Evgeny Borisov
 */
public class Start {
    public static void main(String[] args) {
        Person person = new Person();

        if (person.getMaritalStatus()==MaritalStatus.DIVORCED) {

            System.out.println("life is ....");
        }
        else {
            System.out.println("no");
        }
    }
}
