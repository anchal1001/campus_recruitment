package com.example.campus_recruitment.Repository;

import com.example.campus_recruitment.entity.Category;
import com.example.campus_recruitment.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Transactional
@Repository
public interface CategoryRepository extends JpaRepository <Category,Integer>{

}
