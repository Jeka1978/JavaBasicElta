package com.elta.my_spring;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object replaceWithProxyIfNeeded(Object t, Class<?> originalClass) {

        if (originalClass.isAnnotationPresent(Benchmark.class)|| Arrays.stream(originalClass.getMethods()).anyMatch(method -> method.isAnnotationPresent(Benchmark.class))) {
           if(originalClass.getInterfaces().length==0){
               return Enhancer.create(originalClass, (org.springframework.cglib.proxy.InvocationHandler) (proxy, method, args) -> {
                   return getInvocationHandler(t, originalClass, method, args);

               });
           }else {
               return Proxy.newProxyInstance(originalClass.getClassLoader(), originalClass.getInterfaces(), (proxy, method, args) -> {
                   return getInvocationHandler(t, originalClass, method, args);
               });
           }
        }
        return t;
    }

    private Object getInvocationHandler(Object t, Class<?> originalClass, Method method, Object[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method classMethod = originalClass.getMethod(method.getName(), method.getParameterTypes());
        if (originalClass.isAnnotationPresent(Benchmark.class) || classMethod.isAnnotationPresent(Benchmark.class)) {
            System.out.println("********** Benchmark started for method " + method.getName() + " ********");
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println(end - start);
            System.out.println("********** Benchmark ended for method " + method.getName() + " ********");
            return retVal;
        } else {
            return method.invoke(t, args);
        }
    }
}
