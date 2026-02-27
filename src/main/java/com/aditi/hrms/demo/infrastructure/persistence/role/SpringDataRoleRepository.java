package com.aditi.hrms.demo.infrastructure.persistence.role;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataRoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByRoleName(String roleName);
}
