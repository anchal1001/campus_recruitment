package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.RecruitedDto;
import com.example.campus_recruitment.entity.RecruitedYear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruitedYearService {
    void createRecruitedYear(RecruitedDto recruitedData);
//    public boolean addRecruitedYear()
//}


}