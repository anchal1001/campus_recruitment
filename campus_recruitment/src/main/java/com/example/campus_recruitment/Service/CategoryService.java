package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.CategoryDto;
import com.example.campus_recruitment.entity.Category;
import com.example.campus_recruitment.entity.College;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

public interface CategoryService {
    String addCategory(CategoryDto CategoryDto);
    List<Category> getAllcategory();
    List<College> getAllCollegesByCategoryId( int collegeId);
//   boolean deleteCollegesByCategoryId(int categoryId);
    boolean deleteCategoryById(int CategoryId);

    boolean updateCategory (int categoryId, Category updatedCategory);


}
