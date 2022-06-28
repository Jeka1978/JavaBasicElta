package com.elta.lombok_games;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
@Setter
public class Human {
    private String name;
    @Setter
    private int age;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public static void main(String[] args) {
        Human human = new Human("Jeka", 43);
        human.setName("Moshe");
        System.out.println("human = " + human);
    }
}





