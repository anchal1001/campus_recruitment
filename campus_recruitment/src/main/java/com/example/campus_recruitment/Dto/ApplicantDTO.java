package com.example.campus_recruitment.Dto;

import com.example.campus_recruitment.entity.RecruitedYear;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class ApplicantDTO {



    private int ApplicantId;



    private String firstName;


    private String lastName;

    private String appGender;

    private Date appDateOfBirth;


    private String appEmail;

    private String appPhoneNumber;

    private Double classX;

    private Double classXII;



    private Double graduationCgpa;



    private String phoneNumber;

    private String activeBacklog;



    private int graduationYear;

    private List<RecruitedYear> recruitedyear;


    public ApplicantDTO(int applicantId, String firstName, String lastName, String appGender, Date appDateOfBirth, String appEmail, String appPhoneNumber, Double classX, Double classXII, Double graduationCgpa, String phoneNumber, String activeBacklog, int graduationYear, List<RecruitedYear> recruitedyear) {
        ApplicantId = applicantId;
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
        this.recruitedyear = recruitedyear;
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

    public List<RecruitedYear> getRecruitedyear() {
        return recruitedyear;
    }

    public void setRecruitedyear(List<RecruitedYear> recruitedyear) {
        this.recruitedyear = recruitedyear;
    }


    @Override
    public String toString() {
        return "ApplicantDTO{" +
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
                ", recruitedyear=" + recruitedyear +
                '}';
    }
}
