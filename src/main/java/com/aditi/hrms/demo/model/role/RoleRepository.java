package com.aditi.hrms.demo.model.role;

import java.util.Optional;

public interface RoleRepository {
    Role save(Role role);
    Optional<Role> findByRoleName(String roleName);
}
