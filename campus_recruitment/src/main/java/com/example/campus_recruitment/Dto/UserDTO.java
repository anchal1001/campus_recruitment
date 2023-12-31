package com.example.campus_recruitment.Dto;

import com.example.campus_recruitment.entity.Role;
import jakarta.persistence.*;

import java.util.Date;

public class UserDTO {
//    private int user_id;


    private String name;


    private Date dateOfBirth;




    private String bloodGroup;

    private String gender;




    private String phoneNumber;

    private String alternateNumber;


    private String address;

    private String permanentAddress;






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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAlternateNumber() {
        return alternateNumber;
    }

    public void setAlternateNumber(String alternateNumber) {
        this.alternateNumber = alternateNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
//    public UserDTO( String name, String email, String password,Role role) {
//       this.user_id = user_id;
//        this.name = name;
//        this.email = email;
//        this.password = password;

    public UserDTO(String name,String email, String password, Role role, Date dateOfBirth, String bloodGroup, String gender, String phoneNumber, String alternateNumber, String address, String permanentAddress) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.alternateNumber = alternateNumber;
        this.address = address;
        this.permanentAddress = permanentAddress;
//
    }
//        this.role = role;
//    }


    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", alternateNumber='" + alternateNumber + '\'' +
                ", address='" + address + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
