package com.elta.my_spring;

import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public class Elf {
    @InjectRandomInt(min = 5, max =15)
    private int power;
    @InjectRandomInt(min = 20, max =40)
    private int speed;
}
