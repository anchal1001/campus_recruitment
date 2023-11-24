package com.example.campus_recruitment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="applicant_details")
public class Applicant {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "applicant_id")
    private int ApplicantId;


    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String appGender;
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date appDateOfBirth;

    @Column(name = "email_Id")
    private String appEmail;
    @Column(name = "phone_number")
    private String appPhoneNumber;
    @Column(name = "class_X_marks")
    private Double classX;
    @Column(name = "class_XII_marks")
    private Double classXII;


    @Column(name = "graduation_cgpa")
    private Double graduationCgpa;


    @Column(name = "resume")
    private String phoneNumber;
    @Column(name = "active_backlog")
    private String activeBacklog;


    @Column(name = "graduation_year")
    private int graduationYear;
    @ManyToOne(fetch = FetchType.EAGER,cascade = { CascadeType.MERGE })
    @JoinColumn(name = "year_id")
    private RecruitedYear recruitedyear;


    @OneToOne(mappedBy = "applicant", cascade = CascadeType.ALL)
    private Status status;
    @ManyToMany(cascade = { CascadeType.MERGE },mappedBy = "applicant" )
    @JsonIgnore
    private List<Assessment> assessment;

    public RecruitedYear getRecruitedYear() {
        return recruitedyear;
    }

    public void setRecruitedYear(RecruitedYear recruitedyear) {
        this.recruitedyear = recruitedyear;
    }

    public Applicant() {
    }

    public Applicant( String firstName, String lastName, String appGender, Date appDateOfBirth, String appEmail, String appPhoneNumber, Double classX, Double classXII, Double graduationCgpa, String phoneNumber, String activeBacklog, int graduationYear) {
//        ApplicantId = applicantId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.appGender = appGender;
        this.appDateOfBirth = appDateOfBirth;
        this.appEmail = appEmail;
        this.appPhoneNumber = appPhoneNumber;
        this.classX = classX;
        this.classXII = classXII;
        this.graduationCgpa = graduationCgpa;
        this.phoneNumber = phoneNumber;
        this.activeBacklog = activeBacklog;
        this.graduationYear = graduationYear;
    }


    public int getApplicantId() {
        return ApplicantId;
    }

    public void setApplicantId(int applicantId) {
        ApplicantId = applicantId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAppGender() {
        return appGender;
    }

    public void setAppGender(String appGender) {
        this.appGender = appGender;
    }

    public Date getAppDateOfBirth() {
        return appDateOfBirth;
    }

    public void setAppDateOfBirth(Date appDateOfBirth) {
        this.appDateOfBirth = appDateOfBirth;
    }

    public String getAppEmail() {
        return appEmail;
    }

    public void setAppEmail(String appEmail) {
        this.appEmail = appEmail;
    }

    public String getAppPhoneNumber() {
        return appPhoneNumber;
    }

    public void setAppPhoneNumber(String appPhoneNumber) {
        this.appPhoneNumber = appPhoneNumber;
    }

    public Double getClassX() {
        return classX;
    }

    public void setClassX(Double classX) {
        this.classX = classX;
    }

    public Double getClassXII() {
        return classXII;
    }

    public void setClassXII(Double classXII) {
        this.classXII = classXII;
    }

    public Double getGraduationCgpa() {
        return graduationCgpa;
    }

    public void setGraduationCgpa(Double graduationCgpa) {
        this.graduationCgpa = graduationCgpa;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getActiveBacklog() {
        return activeBacklog;
    }

    public void setActiveBacklog(String activeBacklog) {
        this.activeBacklog = activeBacklog;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }


    @Override
    public String toString() {
        return "Applicant{" +
                "ApplicantId=" + ApplicantId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", appGender='" + appGender + '\'' +
                ", appDateOfBirth=" + appDateOfBirth +
                ", appEmail='" + appEmail + '\'' +
                ", appPhoneNumber='" + appPhoneNumber + '\'' +
                ", classX=" + classX +
                ", classXII=" + classXII +
                ", graduationCgpa=" + graduationCgpa +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", activeBacklog='" + activeBacklog + '\'' +
                ", graduationYear=" + graduationYear +
                '}';
    }
}