package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.ApplicantDTO;
import com.example.campus_recruitment.entity.Applicant;

import java.util.List;

public interface ApplicantService {

    List<Applicant> getAllApplicant();

    Applicant addApplicant(ApplicantDTO applicantDTO);
}
