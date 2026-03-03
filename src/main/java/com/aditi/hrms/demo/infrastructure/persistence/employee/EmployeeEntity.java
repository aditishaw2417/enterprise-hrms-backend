package com.aditi.hrms.demo.infrastructure.persistence.employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private Long candidateId;
    private Long requisitionId;
    private Long positionId;
    private Long departmentId;
    private Long teamId;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    private LocalDate startDate;
    private LocalDate joiningDate;

    private String createdBy;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @PrePersist
    protected void onCreate(){
        this.createdAt = LocalDateTime.now();
    }
    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
    public Long getEmployeeId(){
        return employeeId;
    }
    public String getEmail(){
        return email;
    }
    public LocalDate getJoiningDate(){
        return joiningDate;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public Long getCandidateId() {
        return candidateId;
    }

    public Long getRequisitionId() {
        return requisitionId;
    }

    public Long getPositionId() {
        return positionId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public Long getTeamId() {
        return teamId;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setEmployeeId(Long employeeId){
        this.employeeId = employeeId;
    }
    public void setEmail(String email){
        this.email =email;
    }
    public void setJoiningDate(LocalDate joiningDate){
        this.joiningDate = joiningDate;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }
    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public void setRequisitionId(Long requisitionId) {
        this.requisitionId = requisitionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
