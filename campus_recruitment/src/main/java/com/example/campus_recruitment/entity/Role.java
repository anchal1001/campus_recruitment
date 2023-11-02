package com.example.campus_recruitment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Entity
@Table(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")


    private int role_id;


    @Column(name="role")
    private String role;
    @OneToMany(cascade = { CascadeType.ALL },mappedBy = "role" )
    @JsonIgnore
    private List<User> user = new ArrayList<>();
//    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
//    private List<User> user = new ArrayList<>();

    public Role() {
    }

    public Role(int role_id, String role) {
        this.role_id = role_id;
        this.role = role;
    }


    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", role='" + role + '\'' +
                '}';
    }


}
