package com.example.campus_recruitment.Service;

import com.example.campus_recruitment.Dto.LoginDTO;
import com.example.campus_recruitment.Dto.UserDTO;
import com.example.campus_recruitment.response.LoginResponse;

public interface UserService {
     LoginResponse loginUser(LoginDTO loginDTO);
     String addUser(UserDTO userDTO);

}
