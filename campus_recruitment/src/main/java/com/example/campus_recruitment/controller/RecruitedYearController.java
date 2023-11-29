package com.example.campus_recruitment.controller;


import com.example.campus_recruitment.Dto.RecruitedDto;
import com.example.campus_recruitment.Service.RecruitedYearService;
import com.example.campus_recruitment.entity.RecruitedYear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/api/recruitedyear")
    public class RecruitedYearController {

        @Autowired
        private RecruitedYearService recruitedYearService;

        @PostMapping("/create")
        public ResponseEntity<String> createRecruitedYear(@RequestBody RecruitedDto recruitedData) {
            recruitedYearService.createRecruitedYear(recruitedData);
            return ResponseEntity.ok("RecruitedYear created successfully.");
        }

        // Other controller methods...

    }


