package com.example.campus_recruitment.controller;

import com.example.campus_recruitment.Dto.CollegeDto;
import com.example.campus_recruitment.Service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/college")
public class collegeController {
    @Autowired
    private CollegeService collegeService;
//    @Autowired
//    private CollegeDto collegeDto;

    @PostMapping("/create")
    public ResponseEntity<?> addCollege(@RequestBody CollegeDto collegeDto){
        System.out.println("Add  college callleeddd");
//        System.out.println(categoryDto.getcategoryId);

        return  ResponseEntity.ok(collegeService.addCollege(collegeDto));

    }
}
