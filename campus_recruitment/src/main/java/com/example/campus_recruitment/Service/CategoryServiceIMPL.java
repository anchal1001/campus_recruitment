package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.CategoryDto;

import com.example.campus_recruitment.Repository.CategoryRepository;

import com.example.campus_recruitment.entity.Category;

import com.example.campus_recruitment.entity.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CategoryServiceIMPL  implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public String addCategory(CategoryDto categoryDto) {
        System.out.println(categoryDto);
        Category category = new Category(
                categoryDto.getCategoryName(),
                categoryDto.getCategoryRole(),

                categoryDto.getCtc());
        System.out.println(category);

        System.out.println(categoryDto.getCategoryRole());

        categoryRepository.save(category);
        return category.getCategoryName();

    }

    @Override
    public List<Category> getAllcategory() {
        return categoryRepository.findAll();
    }

    @Override
    public List<College> getAllCollegesByCategoryId(int categoryId) {
        Category category = categoryRepository.findById(categoryId).orElse(null);
        return category.getCollege();
    }


}

