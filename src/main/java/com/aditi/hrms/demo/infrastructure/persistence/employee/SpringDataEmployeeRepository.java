package com.aditi.hrms.demo.infrastructure.persistence.employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataEmployeeRepository extends JpaRepository<EmployeeEntity, Long>{
    Optional<EmployeeEntity> findByEmail(String email);
}
