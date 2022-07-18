package com.elta.java8_demo.don_not_use_if;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class EmployeeService {


    public Map<Seniority, List<Employee>> groupEmpBySeniority(List<Company> companyList) {
        List<Employee> employees = companyList.stream().flatMap(company -> company.getEmployees().stream()).toList();
        return groupBySeniority(employees);
    }

    public Map<Seniority, List<Employee>> groupBySeniority(List<Employee> employees) {
        return null;
    }
}




