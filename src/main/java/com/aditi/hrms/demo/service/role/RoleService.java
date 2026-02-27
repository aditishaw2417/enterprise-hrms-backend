package com.aditi.hrms.demo.service.role;

import org.springframework.stereotype.Service;

import com.aditi.hrms.demo.model.role.Role;
import com.aditi.hrms.demo.model.role.RoleRepository;

@Service
public class RoleService {
    private final RoleRepository roleRepository;
    public RoleService(RoleRepository roleRepository){
        this.roleRepository=roleRepository;
    }
    public Role createRole(String roleName, String description){
        roleRepository.findByRoleName(roleName).ifPresent(r -> {
            throw new RuntimeException("Role already exists!");
        });
        Role role = new Role(roleName, description);
        return roleRepository.save(role);
    }
}
