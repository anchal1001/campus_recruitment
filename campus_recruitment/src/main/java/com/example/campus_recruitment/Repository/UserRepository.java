package com.example.campus_recruitment.Repository;

import com.example.campus_recruitment.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@EnableJpaRepositories
@Transactional
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findOneByEmailAndPassword(String email,String password);
    User findByEmailIgnoreCase(String email);
    Boolean existsByEmail(String email);


        }
