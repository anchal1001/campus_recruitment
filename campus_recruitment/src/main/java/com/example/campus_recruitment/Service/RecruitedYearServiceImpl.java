package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.RecruitedDto;
import com.example.campus_recruitment.Repository.CategoryRepository;
import com.example.campus_recruitment.Repository.CollegeRepository;
import com.example.campus_recruitment.Repository.RecruitedYearRepository;
import com.example.campus_recruitment.entity.Category;
import com.example.campus_recruitment.entity.College;
import com.example.campus_recruitment.entity.RecruitedYear;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruitedYearServiceImpl  implements RecruitedYearService {


    @Autowired
    private RecruitedYearRepository recruitedYearRepository;

    @Autowired
    private CollegeRepository collegeRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    @Transactional
    public void createRecruitedYear(RecruitedDto recruitedData) {


        System.out.println(recruitedData +"createDto data");
        RecruitedYear recruitedYear=new RecruitedYear();
        recruitedYear.setCollege(recruitedData.getCollege());
        recruitedYear.setCategory(recruitedData.getCategory());
        recruitedYear.setAcademicYear(recruitedData.getAcademicYear());
        recruitedYearRepository.save(recruitedYear);
        System.out.println("saved");
//        List<Integer> collegeIds = recruitedData.getCollege();

//        List<Integer> categoryIds = recruitedData.getCategory();
//
//        System.out.println(collegeIds + " " + categoryIds);
//
//        for(int i=1;)
//
//        return null;
        // Perform any additional business logic or validation here
        // Set relationships
//
//        System.out.println(recruitedYear.toString());
//
//        List<College> college = recruitedData.getCollege();
//        List<Category> category = recruitedData.getCategory();
//
//        System.out.println(recruitedData.getAcademicYear() + " " + recruitedData.getCollege() + " " + recruitedData.getCategory());
//
////        recruitedData.setAcademicYear(recruitedData.getAcademicYear());
////
//        if (college != null) {
//            recruitedData.setCollege(recruitedData.getCollege());
//        }
//
//        if (category!= null) {
//            recruitedData.setCategory(recruitedData.getCategory());
//        }
//
//        // Save the RecruitedYear
//        recruitedYearRepository.save(recruitedData);

    }

}
