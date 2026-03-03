package com.aditi.hrms.demo.infrastructure.persistence.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.aditi.hrms.demo.domain.employee.Employee;
import com.aditi.hrms.demo.domain.employee.EmployeeRepository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
    private final SpringDataEmployeeRepository repository;
    public EmployeeRepositoryImpl(SpringDataEmployeeRepository repository){
        this.repository = repository;
    }
    @Override
    public Employee save(Employee employee){
        EmployeeEntity entity = mapToEntity(employee);
        EmployeeEntity saved = repository.save(entity);
        return mapToDomain(saved);
    }

    @Override
    public Optional<Employee> findByEmail(String email){
        return repository.findByEmail(email)
            .map(this::mapToDomain);
    }

    @Override
    public List<Employee> findAll(){
        return repository.findAll()
            .stream()
            .map(this::mapToDomain)
            .toList();
    }

    private EmployeeEntity mapToEntity(Employee employee){
        EmployeeEntity entity = new EmployeeEntity();
        entity.setFullName(employee.getFullName());
        entity.setEmail((employee.getEmail()));
        entity.setJoiningDate(employee.getJoiningDate());
        return entity;
    }
    private Employee mapToDomain(EmployeeEntity entity){
        return new Employee(entity.getEmployeeId(), entity.getFullName(), entity.getEmail(), entity.getJoiningDate());
    }
}
