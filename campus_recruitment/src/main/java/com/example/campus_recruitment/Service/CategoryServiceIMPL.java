package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.CategoryDto;

import com.example.campus_recruitment.Repository.CategoryRepository;

import com.example.campus_recruitment.Repository.CollegeRepository;
import com.example.campus_recruitment.entity.Category;

import com.example.campus_recruitment.entity.College;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceIMPL  implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CollegeRepository collegeRepository;


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

    @Override
    public boolean deleteCategoryById(int categoryId) {
        Optional<Category> optionalCategory = categoryRepository.findById(categoryId);
        if (optionalCategory.isPresent()) {
            categoryRepository.deleteById(categoryId);
            return true;
        } else {
            return false;
        }
    }

//        @Transactional
//
//        public boolean deleteCollegesByCategoryId ( int categoryId){
//            Optional<Category> optionalCategory = categoryRepository.findById(categoryId);
//            if (optionalCategory.isPresent()) {
//                collegeRepository.deleteCategoryById(categoryId);
//                return true;
//            } else {
//                return false;
//            }
//
//
//        }




        @Override
        public boolean updateCategory(int categoryId, Category  updatedCategory) {
            Optional<Category> optionalCategory = categoryRepository.findById(categoryId);
            if (optionalCategory.isPresent()) {
                Category category = optionalCategory.get();

//                category.setName(updatedSchool.getName());
                category.setCategoryName(updatedCategory.getCategoryName());
                        category.setCategoryRole(updatedCategory.getCategoryRole());

                        category.setCtc(updatedCategory.getCtc());


                categoryRepository.save(category);
                return true;
            } else {
                return false;
            }
        }



    }




