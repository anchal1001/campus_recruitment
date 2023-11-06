package com.example.campus_recruitment.entity;

import jakarta.persistence.*;

@Entity
@Table(name="college_details")
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "college_id")


    private int college_id;


    @Column(name = "college_name")
    private String collegeName;
    @Column(name = "contact_person")
    private String contactPerson;


    @Column(name = "email_Id")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "website")
    private String website;
    @Column(name = "location")
    private String location;


    @ManyToOne(fetch = FetchType.EAGER,cascade = { CascadeType.PERSIST })
    @JoinColumn(name = "category_id")
    private Category category;

    public College() {
    }

    public College(String collegeName, String contactPerson, String email, String phoneNumber, String website, String location, Category category) {
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


    @Override
    public String toString() {
        return "College{" +
                "college_id=" + college_id +
                ", collegeName='" + collegeName + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", website='" + website + '\'' +
                ", location='" + location + '\'' +

                '}';
    }
}
