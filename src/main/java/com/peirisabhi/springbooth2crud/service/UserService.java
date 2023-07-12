package com.peirisabhi.springbooth2crud.service;

import com.peirisabhi.springbooth2crud.dto.UserDto;
import com.peirisabhi.springbooth2crud.entity.User;
import com.peirisabhi.springbooth2crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 11/07/2023
 * Time: 14:54
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public UserDto saveUser(UserDto userDto) {
        User user = userDto.toEntity(User.class);
       return userRepository.save(user).toDto(UserDto.class);
    }

    public List<UserDto> getUsers(){
        return userRepository.findAll()
                .stream()
                .map(user -> user.toDto(UserDto.class))
                .collect(Collectors.toList());
    }
}
