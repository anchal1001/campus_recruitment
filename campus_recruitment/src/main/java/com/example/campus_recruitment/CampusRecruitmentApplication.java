package com.example.campus_recruitment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.lang.SecurityException;

@SpringBootApplication
@ComponentScan

public class CampusRecruitmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampusRecruitmentApplication.class, args);
	}

}
