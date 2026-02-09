package com.reyphill.ApiSpringBoot.mappers;

import com.reyphill.ApiSpringBoot.dto.user.UserRequestDto;
import com.reyphill.ApiSpringBoot.dto.user.UserResponseDto;
import com.reyphill.ApiSpringBoot.models.User;

public class UserMappers {
    public static User toEntity(UserRequestDto requestDto){
        User user = new User();
        user.setNombre(requestDto.getNombre());
        user.setEmail(requestDto.getEmail());
        user.setEdad(requestDto.getEdad());
        return user;
    }

    public static UserResponseDto toDto(User user){
        UserResponseDto dto = new UserResponseDto();

        dto.setId(user.getId());
        dto.setNombre(user.getNombre());
        dto.setEmail(user.getEmail());
        dto.setEdad(user.getEdad());

        return dto;
    }
}
