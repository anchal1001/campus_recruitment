package com.example.campus_recruitment.controller;

import com.example.campus_recruitment.Dto.LoginDTO;
import com.example.campus_recruitment.Dto.UserDTO;
import com.example.campus_recruitment.Service.UserService;
import com.example.campus_recruitment.exception.ResourceNotFoundException;
import com.example.campus_recruitment.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private LoginResponse loginResponse;
    private UserDTO userDTO;

    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO) {
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        System.out.print(loginResponse);
//        throw new ResourceNotFoundException("email not exist");
        if (loginResponse.getStatus() == true) {


            System.out.println("in response");
            return ResponseEntity.ok(loginResponse);
        } else {
            LoginResponse response=new LoginResponse();
            response.setMessage(loginResponse.getMessage());
            response.setStatus(loginResponse.getStatus());
            return  new ResponseEntity<>(loginResponse, HttpStatus.FORBIDDEN);
//            throw new ResourceNotFoundException(loginResponse.getMessage());
        }



    }
    @PostMapping("/registration")
    public String  addUser(@RequestBody UserDTO userDTO){

        String  id = userService.addUser(userDTO);
        return  id;

    }
}