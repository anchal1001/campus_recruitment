package com.example.campus_recruitment.Dto;

import com.example.campus_recruitment.entity.Role;
import jakarta.persistence.Column;

public class UserDTO {
//    private int user_id;


    private String name;


    private String email;


    private String password;

    private Role role;
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    //    private int role_id;


//    public int getRole_id() {
//        return role_id;
//    }
//
//    public void setRole_id(int role_id) {
//        this.role_id = role_id;
//    }

    public UserDTO() {
    }

//    public int getUser_id() {
//        return user_id;
//    }
//
//    public void setUser_id(int user_id) {
//        this.user_id = user_id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public UserDTO( String name, String email, String password,Role role) {
//        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserDTO{" +

                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
