package com.peirisabhi.springbooth2crud.controller;

import com.peirisabhi.springbooth2crud.dto.UserDto;
import com.peirisabhi.springbooth2crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 11/07/2023
 * Time: 14:54
 */

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto) {
        System.out.println(userDto.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(userDto));
    }


    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }

}
