package com.aditi.hrms.demo.domain.employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    Employee save(Employee employee);
    Optional<Employee> findByEmail(String email);
    List<Employee> findAll();
}
