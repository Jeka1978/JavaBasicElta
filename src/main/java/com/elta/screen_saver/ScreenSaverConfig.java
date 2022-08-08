package com.elta.screen_saver;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
//@ImportResource("classpath:context.xml")
public class ScreenSaverConfig {


    @Bean
    @Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color color(Random random) {
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }



    @Bean
    public Random random() {
        return new Random();
    }

    @SneakyThrows
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScreenSaverConfig.class);
        System.out.println();
        while (true) {
            context.getBean(ColorFrame.class).moveToRandomLocation();
            Thread.sleep(50);
        }


    }
}
