package com.elta.demo1;

import lombok.SneakyThrows;
import lombok.Value;
import lombok.With;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Evgeny Borisov
 */

@Value
@With
@Slf4j
//@Log4j
public class Employee implements Comparable<Employee>{
    private String name;
    private int salary;


    public void readFromFile(File file) throws Exception {
        FileOutputStream fos = new FileOutputStream(new File(""));
        fos.write(1);
    }


    public static void main(String[] args) {


        Employee employee = new Employee("", 1);
        employee = employee.withName("Jack").withSalary(1000);
        System.out.println(employee);


    }

    @Override
    @SneakyThrows
    public int compareTo(Employee o) {
        FileOutputStream fos = new FileOutputStream(new File(""));
        fos.write(1);


        return 0;
    }
}
