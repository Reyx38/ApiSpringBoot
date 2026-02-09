package com.reyphill.ApiSpringBoot.services;

import com.reyphill.ApiSpringBoot.dto.user.UserRequestDto;
import com.reyphill.ApiSpringBoot.dto.user.UserResponseDto;
import java.util.List;

public interface UserServices {
    UserResponseDto insertUser (UserRequestDto dto);
    List<UserResponseDto> listUser();
    UserResponseDto getUserById(int id);
    UserResponseDto updateUser(int id, UserResponseDto responseDto);
    void deleteUser(int id);
}
