package com.aditi.hrms.demo.dto.employee;

public class EmployeeResponse{
    private Long employeeId;
    private String fullName;
    public EmployeeResponse(Long employeeId, String fullName){
        this.employeeId =employeeId;
        this.fullName=fullName;
    }
    public Long getEmployeeId(){
        return employeeId;
    }
    public String getFullName(){
        return fullName;
    }
}