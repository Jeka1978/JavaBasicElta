package com.elta.real_spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class QuoterAspect {

    @Pointcut("execution(* com.elta.real_spring.*.say*(..))")
    public void sayMethods() {
    }

//    @Before("sayMethods()&&@annotation(com.elta.my_spring.Benchmark)")
//    @Before("@annotation(com.elta.my_spring.Benchmark)")
    @Before("sayMethods()")
    public void beforeAllSayMethods(JoinPoint jp) {
        Signature signature = jp.getSignature();
        System.out.print("this is quote of "+jp.getTarget().getClass().getSimpleName()+" : ");
    }






}
