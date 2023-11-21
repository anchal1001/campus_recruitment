package com.example.campus_recruitment.controller;

import com.example.campus_recruitment.Dto.ApplicantDTO;
import com.example.campus_recruitment.Dto.CollegeDto;
import com.example.campus_recruitment.Service.ApplicantService;
import com.example.campus_recruitment.Service.CollegeService;
import com.example.campus_recruitment.entity.Applicant;
import com.example.campus_recruitment.entity.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/applicant")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    //    @Autowired
//    private CollegeDto collegeDto;
    @GetMapping("/getAll")
    public ResponseEntity<List<Applicant>> getAllApplicant() {
        System.out.println("Add  applicant callleeddd");


        return ResponseEntity.ok(applicantService.getAllApplicant());

    }


    @PostMapping("/create")
    public ResponseEntity<?> addApplicant(@RequestBody ApplicantDTO applicantDTO) {
        System.out.println("Add  applicante callleeddd");
//
        try {

            return ResponseEntity.ok(applicantService.addApplicant(applicantDTO));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Somethimg Went Wrong in college creation");

        }
    }
}