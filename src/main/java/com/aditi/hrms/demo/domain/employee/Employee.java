package com.aditi.hrms.demo.domain.employee;

import java.time.LocalDate;

public class Employee {
    private Long id;
    private String fullName;
    private String email;
    private LocalDate joiningDate;
    public Employee(Long id, String fullName, String email, LocalDate joiningDate){
        this.id =id;
        this.fullName = fullName;
        this.email =email;
        this.joiningDate = joiningDate;
    }
    public Employee(String fullName, String email, LocalDate joiningDate){
        this.fullName = fullName;
        this.email = email;
        this.joiningDate =joiningDate;
    }
    public Long getId(){
        return id;
    }
    public String getFullName(){
        return fullName;
    }
    public String getEmail(){
        return email;
    }
    public LocalDate getJoiningDate(){
        return joiningDate;
    }
}
