package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.LoginDTO;
import com.example.campus_recruitment.Repository.UserRepository;
import com.example.campus_recruitment.exception.ResourceNotFoundException;
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
        try {
            User user1 = userRepository.findByEmail(loginDTO.getEmail());
            if (user1 != null) {
                String password = loginDTO.getPassword();
                boolean isPwdRight = password.matches(password);
                if (isPwdRight) {
                    Optional<User> user = userRepository.findOneByEmailAndPassword(loginDTO.getEmail(), password);
                    if (user.isPresent()) {
                        System.out.println("yes");
                        return new LoginResponse("login success", true);
                    } else {
                        throw new ResourceNotFoundException("Login failed");
                    }
                }
                else {
                    System.out.println("no password");
                    throw new ResourceNotFoundException("password not match");
                }
            }
            else {
                System.out.println("no email");
                throw new ResourceNotFoundException("email not exist");
            }
        }catch (ResourceNotFoundException e) {
            System.out.println("Login failed: " + e.getMessage());
            return new LoginResponse(e.getMessage(), false);
        }
    }
}




