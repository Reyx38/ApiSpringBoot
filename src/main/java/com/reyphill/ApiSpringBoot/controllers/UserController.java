package com.reyphill.ApiSpringBoot.controllers;

import com.reyphill.ApiSpringBoot.dto.user.UserRequestDto;
import com.reyphill.ApiSpringBoot.dto.user.UserResponseDto;
import com.reyphill.ApiSpringBoot.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UserController {
    @Autowired
    private UserServices userServices;

    @PostMapping
    public UserResponseDto postUser(@RequestBody UserRequestDto requestDto) {return userServices.insertUser(requestDto);}

    @GetMapping
    public List<UserResponseDto> getUsers(){return userServices.listUser();}
}
