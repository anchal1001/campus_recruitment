package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.CollegeDto;
import com.example.campus_recruitment.entity.College;

import java.util.List;

public interface CollegeService {
    College addCollege(CollegeDto collegeDto);
    List<College> getAllColleges();
    boolean updateCollegeById(int collegeId, College updatedCollege);
    boolean deleteCollegeById(int collegeId);


}
