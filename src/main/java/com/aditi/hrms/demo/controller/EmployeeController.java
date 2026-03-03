package com.aditi.hrms.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditi.hrms.demo.application.employee.EmployeeService;
import com.aditi.hrms.demo.domain.employee.Employee;
import com.aditi.hrms.demo.dto.employee.CreateEmployeeRequest;
import com.aditi.hrms.demo.dto.employee.EmployeeResponse;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @PostMapping
    public EmployeeResponse createEmployee(@Valid @RequestBody CreateEmployeeRequest request) {
        Employee emp = employeeService.createEmployee(request.getFullName(), request.getFullName(), request.getJoiningDate());
        return new EmployeeResponse(emp.getId(), emp.getFullName());
    }
}
