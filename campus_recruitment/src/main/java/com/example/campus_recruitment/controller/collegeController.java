package com.example.campus_recruitment.controller;

import com.example.campus_recruitment.Dto.CollegeDto;
import com.example.campus_recruitment.Service.CollegeService;
import com.example.campus_recruitment.entity.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/college")
public class collegeController {
    @Autowired
    private CollegeService collegeService;
//    @Autowired
//    private CollegeDto collegeDto;
    @GetMapping("/getAll")
    public ResponseEntity<List<College>> getAllColleges(){
        System.out.println("Add  college callleeddd");
//        System.out.println(categoryDto.getcategoryId);

        return  ResponseEntity.ok(collegeService.getAllColleges());

    }

    @PostMapping("/create")
    public ResponseEntity<?> addCollege(@RequestBody CollegeDto collegeDto){
        System.out.println("Add  college callleeddd");
//        System.out.println(categoryDto.getcategoryId);
        try {

            return ResponseEntity.ok(collegeService.addCollege(collegeDto));
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Somethimg Went Wrong in college creation");

        }

        }

    @GetMapping("/getAll")
    public ResponseEntity<Object> getAllCollege() {
        try {
            return ResponseEntity.ok().body(collegeService.getAllColleges());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Somethimg Went Wrong");

        }
    }}



