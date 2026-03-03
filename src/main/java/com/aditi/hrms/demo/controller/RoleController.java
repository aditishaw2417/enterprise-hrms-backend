package com.aditi.hrms.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditi.hrms.demo.application.role.RoleService;
import com.aditi.hrms.demo.domain.role.Role;
import com.aditi.hrms.demo.dto.role.CreateRoleRequest;
import com.aditi.hrms.demo.dto.role.RoleResponse;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/roles")
public class RoleController {
    private final RoleService roleService;
    public RoleController(RoleService roleService){
        this.roleService=roleService;
    }
    @PostMapping
    public RoleResponse createRole(@Valid @RequestBody CreateRoleRequest request) {
        Role role = roleService.createRole(request.getRoleName(), request.getDescription());
        return new RoleResponse(role.getId(), role.getRoleName());
    }
    
    @GetMapping("/{name}")
    public RoleResponse getRole(@PathVariable String name){
        Role role = roleService.getByRoleName(name);
        return new RoleResponse(role.getId(), role.getRoleName());
    }
}
