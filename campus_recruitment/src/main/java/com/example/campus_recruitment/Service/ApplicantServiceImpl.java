package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.ApplicantDTO;
import com.example.campus_recruitment.Dto.CollegeDto;
import com.example.campus_recruitment.Repository.ApplicantRepository;
import com.example.campus_recruitment.Repository.CollegeRepository;
import com.example.campus_recruitment.entity.Applicant;
import com.example.campus_recruitment.entity.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApplicantServiceImpl   implements ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;
    public List<Applicant> getAllApplicant() {
        return applicantRepository.findAll();
    }


    @Override
    public Applicant addApplicant(ApplicantDTO applicantDTO) {
        Applicant applicant = new Applicant();

        applicant.setApplicantId(applicantDTO.getApplicantId());
        applicant.setFirstName(applicantDTO.getFirstName());
        applicant.setLastName(applicantDTO.getLastName());

        applicant.setAppGender(applicantDTO.getAppGender());
        applicant.setAppDateOfBirth(applicantDTO.getAppDateOfBirth());
        applicant.setAppEmail(applicantDTO.getAppEmail());

        applicant.setPhoneNumber(applicantDTO.getPhoneNumber());


//        this.appPhoneNumber = appPhoneNumber;
//        this.classX = classX;
//        this.classXII = classXII;
//        this.graduationCgpa = graduationCgpa;
//        this.phoneNumber = phoneNumber;
//        this.activeBacklog = activeBacklog;
//        this.graduationYear = graduationYear;
//        this.recruitedyear = recruitedyear;


        System.out.println(applicantDTO);
        System.out.println(applicant);
//      return collegeRepository.save(college);
        return applicantRepository.save(applicant);

//        return collegeDto.getCollegeName();
    }
}
