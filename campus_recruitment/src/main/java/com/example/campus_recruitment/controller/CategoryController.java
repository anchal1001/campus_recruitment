package com.example.campus_recruitment.controller;

import com.example.campus_recruitment.Dto.CategoryDto;
import com.example.campus_recruitment.Dto.UserDTO;
import com.example.campus_recruitment.Service.CategoryService;
import com.example.campus_recruitment.entity.Category;
import com.example.campus_recruitment.entity.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api/category")
public class CategoryController {

  @Autowired
    private CategoryService categoryService;
    @PostMapping("/create")
    public ResponseEntity<?> addCategory(@RequestBody CategoryDto categoryDto){
        System.out.println("category created  callleeddd");
//      System.out.println(categoryDto);
try {
    return ResponseEntity.ok(categoryService.addCategory(categoryDto));
}
catch (Exception e){
    e.printStackTrace();
    return ResponseEntity.badRequest().body("couldn't add category");

}
    }

    @GetMapping("/getAll")
    public ResponseEntity<Object> getAllCategory() {
        try {
            return ResponseEntity.ok().body(categoryService.getAllcategory());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Somethimg Went Wrong");

        }
    }
    @GetMapping("getAllCollegesBy/{categoryId}")
    public List<College> getAllCollegesByCategoryId(@PathVariable int categoryId)
    {
        return categoryService.getAllCollegesByCategoryId(categoryId);

    }
}



