package com.example.campus_recruitment.controller;

import com.example.campus_recruitment.Service.RoundService;
import com.example.campus_recruitment.entity.College;
import com.example.campus_recruitment.entity.Round;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("api/round")
public class RoundController {
    @Autowired
    private RoundService roundService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Round>> getAllRound(){
        System.out.println("get round callleeddd");


        return  ResponseEntity.ok(roundService.getAllRound());

    }
}
