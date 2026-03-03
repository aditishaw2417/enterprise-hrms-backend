package com.aditi.hrms.demo.infrastructure.persistence.role;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.aditi.hrms.demo.domain.role.Role;
import com.aditi.hrms.demo.domain.role.RoleRepository;

@Repository
public class RoleRepositoryImpl implements RoleRepository {
    private final SpringDataRoleRepository repository;
    public RoleRepositoryImpl(SpringDataRoleRepository repository){
        this.repository = repository;
    }
    @Override
    public Role save(Role role){
        RoleEntity entity = mapToEntity(role);
        RoleEntity saved = repository.save(entity);
        return mapToDomain(saved);
    }
    @Override
    public Optional<Role> findByRoleName(String roleName){
        return repository.findByRoleName(roleName).map(this::mapToDomain);
    }
    private RoleEntity mapToEntity(Role role){
        RoleEntity entity = new RoleEntity();
        entity.setRoleName(role.getRoleName());
        entity.setDescription(role.getDescription());
        entity.setCreatedBy("SYSTEM");
        return entity;
    }
    private Role mapToDomain(RoleEntity entity){
        return new Role(entity.getRoleId(), entity.getRoleName(), entity.getDescription());
    }
}
