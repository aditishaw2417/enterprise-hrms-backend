package com.aditi.hrms.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditi.hrms.demo.dto.role.CreateRoleRequest;
import com.aditi.hrms.demo.dto.role.RoleResponse;
import com.aditi.hrms.demo.model.role.Role;
import com.aditi.hrms.demo.service.role.RoleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/roles")
public class RoleController {
    private final RoleService roleService;
    public RoleController(RoleService roleService){
        this.roleService=roleService;
    }
    @PostMapping
    public RoleResponse createRole(@RequestBody CreateRoleRequest request) {
        Role role = roleService.createRole(request.getRoleName(), request.getDescription());
        return new RoleResponse(role.getId(), role.getRoleName());
    }
    
}
