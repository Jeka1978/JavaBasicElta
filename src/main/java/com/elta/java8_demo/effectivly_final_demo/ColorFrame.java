package com.elta.java8_demo.effectivly_final_demo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {


    public ColorFrame() throws HeadlessException {

        final int[] counter = new int[1];





        List<String> list=new ArrayList<>();
        Thread thread = new Thread(() -> {
            long l =0;
            StringBuilder stringBuilder = new StringBuilder();
            while (true) {
                System.out.println(123);
                Random random = new Random();
                int i = random.nextInt(100);
                if (i == 50) {
                    stringBuilder.append(i + "dasdsa"+l);
                    l++;
                    list.add(stringBuilder.toString());
                }
            }
        });
        thread.setName("Maor and Janna Thread");
        thread.start();
        JButton button = new JButton("click me");
        button.addActionListener(e -> System.out.println(counter[0]++));
        getContentPane().add(button);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new ColorFrame();
    }
}
