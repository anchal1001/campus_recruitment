package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.CollegeDto;
import com.example.campus_recruitment.Dto.UserDTO;
import com.example.campus_recruitment.Repository.CollegeRepository;
import com.example.campus_recruitment.entity.Category;
import com.example.campus_recruitment.entity.College;
import com.example.campus_recruitment.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollegeServiceImpl implements CollegeService{
    @Autowired
    private CollegeRepository collegeRepository;

    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }



    @Override
    public College addCollege(CollegeDto collegeDto) {
        College college = new College();
        college.setCollegeName(collegeDto.getCollegeName());
        college.setEmail(collegeDto.getEmail());
        college.setContactPerson(collegeDto.getContactPerson());
        college.setPhoneNumber(collegeDto.getPhoneNumber());
        college.setWebsite(collegeDto.getWebsite());
        college.setLocation(collegeDto.getLocation());
        college.setCategory(collegeDto.getCategory());


      System.out.println(collegeDto);
      System.out.println(college);
//      return collegeRepository.save(college);
      return collegeRepository.save(college);

//        return collegeDto.getCollegeName();
    }

    @Override
    public boolean updateCollegeById(int collegeId, College updatedCollege) {
        Optional<College> optionalCollege= collegeRepository.findById(collegeId);
        if (optionalCollege.isPresent()) {
            College college = optionalCollege.get();

//
            college.setCollegeName(updatedCollege.getCollegeName());
            college.setContactPerson(updatedCollege.getContactPerson());
            college.setEmail(updatedCollege.getEmail());
            college.setPhoneNumber(updatedCollege.getPhoneNumber());
            college.setWebsite(updatedCollege.getWebsite());
            college.setLocation(updatedCollege.getLocation());

            college.setCategory(updatedCollege.getCategory());


            collegeRepository.save(college);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteCollegeById(int collegeId) {
        Optional<College> optionalCollege =collegeRepository.findById(collegeId);
        if(optionalCollege.isPresent())
        {
        collegeRepository.deleteById(collegeId);
        return true;}
        else{
            return false;
        }

    }

}

