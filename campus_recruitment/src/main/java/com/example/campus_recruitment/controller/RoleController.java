package com.example.campus_recruitment.controller;

import com.example.campus_recruitment.Service.RoleService;
import com.example.campus_recruitment.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    @Autowired
    RoleService roleService;
    @GetMapping("")
    public ResponseEntity<Object> getAllRoles(){
    try{
        return ResponseEntity.ok().body(roleService.getAllRoles());
    }catch (Exception e){
        e.printStackTrace();
        return ResponseEntity.badRequest().body("Somethimg Went Wrong");

    }
    }
}
