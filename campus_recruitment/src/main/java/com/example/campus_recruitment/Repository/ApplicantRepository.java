package com.example.campus_recruitment.Repository;

import com.example.campus_recruitment.entity.Applicant;
import com.example.campus_recruitment.entity.Category;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Transactional
@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,Integer>{





}
