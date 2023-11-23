package com.example.campus_recruitment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.Year;
import java.util.List;
@Entity
@Table(name="recruited_year")
public class RecruitedYear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "year_id")
    private int yearId;


    @Column(name = "academic_year")
    private Year academicYear;

    @ManyToMany(cascade = { CascadeType.MERGE },mappedBy = "recruitedyear" )
    @JsonIgnore
    private List<College> college;


    @OneToMany(cascade = { CascadeType.MERGE }, mappedBy = "recruitedyear")
    @JsonIgnore
    private List<Applicant> applicant;
    @ManyToMany(cascade = { CascadeType.MERGE },mappedBy = "recruitedyear" )
    @JsonIgnore
    private List<Category> category;


    public RecruitedYear(int yearId, Year academicYear, List<College> college, List<Applicant> applicant, List<Category> category) {
        this.yearId = yearId;
        this.academicYear = academicYear;
        this.college = college;
        this.applicant = applicant;
        this.category = category;
    }


    public RecruitedYear() {
    }

    public int getYearId() {
        return yearId;
    }

    public void setYearId(int yearId) {
        this.yearId = yearId;
    }

    public Year getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(Year academicYear) {
        this.academicYear = academicYear;
    }

    public List<College> getCollege() {
        return college;
    }

    public void setCollege(List<College> college) {
        this.college = college;
    }

    public List<Applicant> getApplicant() {
        return applicant;
    }

    public void setApplicant(List<Applicant> applicant) {
        this.applicant = applicant;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "RecruitedYear{" +
                "yearId=" + yearId +
                ", academicYear=" + academicYear +
                ", college=" + college +
                ", applicant=" + applicant +
                ", category=" + category +
                '}';
    }
}
