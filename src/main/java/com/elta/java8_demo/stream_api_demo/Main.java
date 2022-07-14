package com.elta.java8_demo.stream_api_demo;

import com.elta.demo1.Employee;
import com.elta.java8_demo.lab.Animal;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {



        List<Employee> employees = List.of(
                new Employee("Jack", 10),
                new Employee("Sam", 20),
                new Employee("John", 5),
                new Employee("Janna", 50));

        employees.stream()
                .filter(employee -> employee.getSalary()>5)
                .peek(System.out::println)
                .map(Employee::getName)
                .filter(s -> s.contains("J"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


        IntStream.iterate(1, value -> value<10, value -> value+1).forEach(System.out::println);




















    }
}
