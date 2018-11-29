package com.tw.apistackbase.Repository;

import java.util.List;

import com.tw.apistackbase.core.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findByName(String name);
}