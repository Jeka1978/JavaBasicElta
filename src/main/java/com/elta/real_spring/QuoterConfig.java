package com.elta.real_spring;

import org.springframework.context.annotation.*;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@PropertySource("classpath:quoters.properties")
public class QuoterConfig {

}


