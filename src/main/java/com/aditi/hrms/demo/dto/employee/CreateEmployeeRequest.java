package com.aditi.hrms.demo.dto.employee;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CreateEmployeeRequest {
    @NotBlank
    private String fullName;
    @NotBlank
    @Email
    private String email;
    private LocalDate joiningDate;
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
