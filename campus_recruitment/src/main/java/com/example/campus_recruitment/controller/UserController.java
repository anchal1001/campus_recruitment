package com.example.campus_recruitment.controller;

import com.example.campus_recruitment.Dto.LoginDTO;
import com.example.campus_recruitment.Service.UserService;
import com.example.campus_recruitment.exception.ResourceNotFoundException;
import com.example.campus_recruitment.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private LoginResponse loginResponse;

    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO) {
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        System.out.print(loginResponse);
//        throw new ResourceNotFoundException("email not exist");
        if(loginResponse.getStatus()==true){


        return ResponseEntity.ok(loginResponse);}
        else {
             throw new ResourceNotFoundException("invalid credentials");
        }
    }

}
