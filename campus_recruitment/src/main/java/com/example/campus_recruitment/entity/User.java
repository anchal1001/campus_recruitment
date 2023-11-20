package com.example.campus_recruitment.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
    @Table(name="user")
    public class  User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")


    private int user_id;



    @Column(name = "user_name")
    private String name;
    @Column(name ="dob")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;



    @Column(name = "blood_group")
    private String bloodGroup;
    @Column(name = "gender")
    private String gender;



    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "alternate_contact")
    private String alternateNumber;

    @Column(name = "present_address")
    private String address;
    @Column(name="permanent_address")
    private String permanentAddress;



    @Column(name = "email_Id",unique =true)
    private String email;
    @Column(name = "password")
    private String password;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role role;


    public User() {

    }

    public User( String name, String email, String password, Role role, Date dateOfBirth, String bloodGroup, String gender, String phoneNumber, String alternateNumber, String address, String permanentAddress) {
      
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

    }

//    public User(String name, String email, String password, Role role) {
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.role = role;
//    }
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", alternateNumber='" + alternateNumber + '\'' +
                ", address='" + address + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +

                '}';
    }
}
