package com.elta.screen_saver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public  class ColorFrame extends JFrame {

    @Autowired
    private Color backgroundColor;



    @Autowired
    private Random random;

    @PostConstruct
    public void  init(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
        setVisible(true);
        System.out.println(backgroundColor.getClass().getName());
        System.out.println(backgroundColor.getRed());
        System.out.println(backgroundColor.getRed());
        System.out.println(backgroundColor.getRed());
    }


    public void moveToRandomLocation() {
        getContentPane().setBackground(backgroundColor);
        setLocation(random.nextInt(1200),random.nextInt(900));
        repaint();
    }
/*
    @Lookup
    protected Color getColorBean(){return null;}*/


}
