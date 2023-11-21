package com.example.campus_recruitment.Service;


import com.example.campus_recruitment.Repository.RoundRepository;
import com.example.campus_recruitment.entity.Role;
import com.example.campus_recruitment.entity.Round;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoundServiceImpl implements RoundService {
@Autowired
private RoundRepository roundRepository;
    @Override
    public List<Round> getAllRound() {
        return roundRepository.findAll();
    }
}
