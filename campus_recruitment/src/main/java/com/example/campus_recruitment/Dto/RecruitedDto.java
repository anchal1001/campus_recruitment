package com.example.campus_recruitment.Dto;

import com.example.campus_recruitment.entity.Applicant;
import com.example.campus_recruitment.entity.Category;
import com.example.campus_recruitment.entity.College;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.Year;
import java.util.List;

//@Getter

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RecruitedDto {

    private  int yearId;

    private  Year academicYear;

    private  List<College> college;

    private  List<Category> category;

}
