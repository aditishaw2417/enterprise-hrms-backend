package com.aditi.hrms.demo.application.employee;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aditi.hrms.demo.domain.employee.Employee;
import com.aditi.hrms.demo.domain.employee.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    public Employee createEmployee(String fullName, String email, java.time.LocalDate joiningDate){
        employeeRepository.findByEmail(email)
            .ifPresent(e -> {
                throw new RuntimeException("Employee akready exists with this email");
            });
        Employee employee = new Employee(fullName, email, joiningDate);
        return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
