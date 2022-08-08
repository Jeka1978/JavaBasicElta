package com.elta.java8_demo.don_not_use_if;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
public class EmployeeService {


    public Map<Seniority, List<Employee>> groupEmpBySeniority(List<Company> companyList) {
        List<Employee> employees = companyList.stream().flatMap(company -> company.getEmployees().stream()).collect(Collectors.toList());
        return groupBySeniority(employees);
    }

    public Map<Seniority, List<Employee>> groupBySeniority(List<Employee> employees) {

        return employees.stream().collect(Collectors.groupingBy(employee -> Seniority.bySalary(employee.getSalary())));

    }

    public Map<Seniority, Long> countBySeniority(List<Employee> employees) {

        /* employees.stream().collect(Collectors.groupingBy(employee -> Seniority.bySalary(employee.getSalary()),
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));*/

        return employees.stream().collect(Collectors.groupingBy(employee -> Seniority.bySalary(employee.getSalary()),
                Collectors.counting()));
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                Employee.builder().salary(10).build(),
                Employee.builder().salary(12).build(),
                Employee.builder().salary(15).build(),
                Employee.builder().salary(16).build(),
                Employee.builder().salary(17).build(),
                Employee.builder().salary(100).build()
        );

        EmployeeService employeeService = new EmployeeService();
        System.out.println(employeeService.groupBySeniority(employees));
    }
}




