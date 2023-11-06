package com.example.campus_recruitment.controller;

import com.example.campus_recruitment.Dto.CategoryDto;
import com.example.campus_recruitment.Dto.UserDTO;
import com.example.campus_recruitment.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("api/category")
public class CategoryController {

  @Autowired
    private CategoryService categoryService;
    @PostMapping("/create")
    public ResponseEntity<?> addCategory(@RequestBody CategoryDto categoryDto){
        System.out.println("category created  callleeddd");
//      System.out.println(categoryDto);
//try {
    return ResponseEntity.ok(categoryService.addCategory(categoryDto));
//}
//catch (Exception e){
//    e.printStackTrace();
//    return ResponseEntity.badRequest().body("couldn't add category");

//}
    }

}
