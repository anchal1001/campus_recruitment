package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.LoginDTO;
import com.example.campus_recruitment.Repository.UserRepository;
import com.example.campus_recruitment.response.LoginResponse;
import com.example.campus_recruitment.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceIMP implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        String msg = "";
        User user1 =  userRepository.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            boolean isPwdRight = password.matches(password);
            if (isPwdRight) {
                Optional<User> user = userRepository.findOneByEmailAndPassword(loginDTO.getEmail(), password);
                if (user.isPresent()) {
                    return new LoginResponse("login sucess", true);
                } else {
                    return new LoginResponse("login failed", false);
                }
            }
            else {
                return new LoginResponse("password not match", false);
            }


        }
        else {
            return new LoginResponse("email not exist", false);
        }}}




