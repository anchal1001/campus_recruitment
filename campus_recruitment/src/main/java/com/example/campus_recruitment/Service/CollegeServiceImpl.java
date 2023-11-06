package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.CollegeDto;
import com.example.campus_recruitment.Dto.UserDTO;
import com.example.campus_recruitment.Repository.CollegeRepository;
import com.example.campus_recruitment.entity.College;
import com.example.campus_recruitment.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements CollegeService{
    @Autowired
    private CollegeRepository collegeRepository;
    @Override
    public String addCollege(CollegeDto collegeDto) {
        College college = new College(
                collegeDto.getCollegeName(),
                collegeDto.getContactPerson(),

                collegeDto.getEmail(),
                collegeDto.getPhoneNumber(),
                collegeDto.getWebsite(),
                collegeDto.getLocation(),
                collegeDto.getCategory());


        collegeRepository.save(college);
      System.out.println(collegeDto);
        return collegeDto.getCollegeName();
    }



}

