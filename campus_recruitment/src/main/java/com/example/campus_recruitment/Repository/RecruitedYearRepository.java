package com.example.campus_recruitment.Repository;

import com.example.campus_recruitment.Dto.RecruitedDto;
import com.example.campus_recruitment.entity.RecruitedYear;
import com.example.campus_recruitment.entity.Role;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Transactional
@Repository
public interface RecruitedYearRepository extends JpaRepository<RecruitedYear,Integer> {
}
