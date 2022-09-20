package com.example.usermicroservice.service;

import com.example.usermicroservice.dto.UserDto;


public interface UserService {

    UserDto createUser(UserDto userDto);
}
