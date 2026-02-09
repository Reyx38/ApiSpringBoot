package com.reyphill.ApiSpringBoot.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {
    private int id;
    private String nombre;
    private String email;
    private int edad;
}
