package com.elta.qualifier_lab;/**
 * @author Evgeny Borisov
 */

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Qualifier
public @interface Mode {
    ModeType value();
}
