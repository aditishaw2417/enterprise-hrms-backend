package com.aditi.hrms.demo.model.role;

public class Role {
    private Long id;
    private String roleName;
    private String description;
    public Role(Long id, String roleName, String description){
        this.id =id;
        this.roleName =roleName;
        this.description = description;
    }
    public Role(String roleName, String description){
        this.roleName = roleName;
        this.description =description;
    }
    public Long getId(){
        return id;
    }
    public String getRoleName(){
        return roleName;
    }
    public String getDescription(){
        return description;
    }
}
