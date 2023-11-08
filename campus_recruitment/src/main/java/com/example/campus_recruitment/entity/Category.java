package com.example.campus_recruitment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
//@AllArgsConstructor
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryId;


    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "category_role")
    private String categoryRole;

    @Column(name = "Ctc")
    private double  ctc;
    @OneToMany(cascade = { CascadeType.MERGE },mappedBy = "category" )
    @JsonIgnore
    private List<College> college;

    public Category() {
    }

    public Category(String categoryName, String categoryRole, double ctc) {
        this.categoryName = categoryName;
        this.categoryRole = categoryRole;
        this.ctc = ctc;
    }

    public Category(int categoryId, String categoryName, String categoryRole, double ctc) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryRole = categoryRole;
        this.ctc = ctc;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public List<College> getCollege() {
        return college;
    }

    public void setCollege(List<College> college) {
        this.college = college;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryRole() {
        return categoryRole;
    }

    public void setCategoryRole(String categoryRole) {
        this.categoryRole = categoryRole;
    }

    public double getCtc() {
        return ctc;
    }

    public void setCtc(double ctc) {
        this.ctc = ctc;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", CategoryRole='" + categoryRole + '\'' +
                ", ctc=" + ctc +
                '}';
    }
}
