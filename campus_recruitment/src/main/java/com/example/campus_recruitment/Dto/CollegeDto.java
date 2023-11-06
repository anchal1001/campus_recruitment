package com.example.campus_recruitment.Dto;

import com.example.campus_recruitment.entity.Category;
import jakarta.persistence.Column;

public class CollegeDto {

    private String collegeName;

    private String contactPerson;


    private String email;

    private String phoneNumber;

    private String website;

    private String location;
    private Category category;

    public CollegeDto() {
    }

    public CollegeDto(String collegeName, String contactPerson, String email, String phoneNumber, String website, String location, Category category) {
        this.collegeName = collegeName;
        this.contactPerson = contactPerson;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.location = location;




        this.category = category;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "CollegeDto{" +
                "collegeName='" + collegeName + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", website='" + website + '\'' +
                ", location='" + location + '\'' +
                ", category=" + category +
                '}';
    }
}