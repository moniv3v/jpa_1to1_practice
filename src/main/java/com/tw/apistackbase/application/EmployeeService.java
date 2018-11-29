package com.tw.apistackbase.application;

import com.tw.apistackbase.Repository.EmployeeRepository;
import com.tw.apistackbase.core.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    private static List<Employee> employees = new LinkedList<>(Arrays.asList(
        new Employee("Xiaoming", 20),
        new Employee("Xiaohong", 19),
        new Employee("Xiaozhi", 15)
    ));
    public List<Employee> list() {
        return (List<Employee>) employeeRepository.findAll();
    }

    public void add(Employee employee) {
        employeeRepository.save(employee);
    }
}
