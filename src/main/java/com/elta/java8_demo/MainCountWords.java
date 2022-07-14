package com.elta.java8_demo;

import com.elta.demo1.Employee;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class MainCountWords {
    @SneakyThrows
    public static void main(String[] args) {
        String fileName = "data/yest.txt";
        Stream<String> lines = Files.lines(Paths.get(fileName));
        Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split("\\W+")));




        Map<String, Integer> map = words.collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        System.out.println(map);


     /*   List<Employee> employees = List.of(new Employee("John", 15), new Employee("John", 10));

        Map<String, Integer> empMap = employees.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary, Integer::max));
        System.out.println(empMap);*/


    }
}
