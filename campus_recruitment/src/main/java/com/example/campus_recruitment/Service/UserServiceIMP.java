package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.LoginDTO;
import com.example.campus_recruitment.Dto.UserDTO;
import com.example.campus_recruitment.Repository.UserRepository;
import com.example.campus_recruitment.exception.ResourceNotFoundException;
import com.example.campus_recruitment.response.LoginResponse;
import com.example.campus_recruitment.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceIMP implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addUser(UserDTO userDTO) {
        User user = new User(
                userDTO.getName(),
                userDTO.getEmail(),
                this.passwordEncoder.encode(userDTO.getPassword()),
               userDTO.getRole());


        userRepository.save(user);
        System.out.println(userDTO);
        return user.getName();
    }

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        try {
            User user1 = userRepository.findByEmail(loginDTO.getEmail());
            System.out.println(user1);
            if (user1 != null) {
                String password = loginDTO.getPassword();
//                String encodedPassword = user1.getPassword();
                boolean isPwdRight = user1.getPassword().matches(password);
                if (isPwdRight) {
                    Optional<User> user = userRepository.findOneByEmailAndPassword(loginDTO.getEmail(), password);
                    if (user.isPresent()) {
                        System.out.println("yes");
                        return new LoginResponse("login success", true);
                    } else {
                        return  new LoginResponse("Login failed" ,false);
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




