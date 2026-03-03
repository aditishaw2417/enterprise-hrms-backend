package com.aditi.hrms.demo.dto.role;

import jakarta.validation.constraints.NotBlank;

public class CreateRoleRequest {
    @NotBlank
    private String roleName;
    private String description;
    public String getRoleName(){
        return roleName;
    }
    public String getDescription(){
        return description;
    }
}
