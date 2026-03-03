package com.aditi.hrms.demo.application.role;

import org.springframework.stereotype.Service;

import com.aditi.hrms.demo.domain.role.Role;
import com.aditi.hrms.demo.domain.role.RoleRepository;

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
    public Role getByRoleName(String roleName){
        return roleRepository.findByRoleName(roleName)
            .orElseThrow(() -> new RuntimeException("Role not found!" + roleName));
    }
}
