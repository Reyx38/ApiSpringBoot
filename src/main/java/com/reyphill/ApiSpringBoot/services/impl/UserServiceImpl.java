package com.reyphill.ApiSpringBoot.services.impl;



import com.reyphill.ApiSpringBoot.dto.user.UserRequestDto;
import com.reyphill.ApiSpringBoot.dto.user.UserResponseDto;
import com.reyphill.ApiSpringBoot.mappers.UserMappers;
import com.reyphill.ApiSpringBoot.models.User;
import com.reyphill.ApiSpringBoot.repository.UserRepository;
import com.reyphill.ApiSpringBoot.services.UserServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements UserServices {
    private final UserRepository usuarioRepository;

    public UserServiceImpl(UserRepository usuarioRepository) {this.usuarioRepository = usuarioRepository;}

    @Override
    public UserResponseDto insertUser(UserRequestDto dto) {
        User saveUser = usuarioRepository.save(UserMappers.toEntity(dto));
        return UserMappers.toDto(saveUser);
    }

    @Override
    public List<UserResponseDto> listUser() {
        return usuarioRepository.findAll()
                .stream().map(UserMappers::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponseDto getUserById(int id) {
        User user = usuarioRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Don't a user with this Id" + id)
                );

        return UserMappers.toDto(user);
    }

    @Override
    public UserResponseDto updateUser(int id, UserResponseDto responseDto) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
