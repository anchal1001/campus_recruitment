package com.example.campus_recruitment.Dto;

import jakarta.persistence.Column;

public class CategoryDto {


//    private int categoryId;


    private String categoryName;



    private String categoryRole;
    private double ctc;


    public CategoryDto(String categoryName, String categoryRole, double ctc) {
        this.categoryName = categoryName;
        this.categoryRole = categoryRole;
        this.ctc = ctc;
    }

    public CategoryDto() {
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
        return "CategoryDto{" +
                "categoryName='" + categoryName + '\'' +
                ", categoryRole='" + categoryRole + '\'' +
                ", ctc=" + ctc +
                '}';
    }
}