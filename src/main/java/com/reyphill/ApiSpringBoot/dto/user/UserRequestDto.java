package com.reyphill.ApiSpringBoot.dto.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    private String email;
    private int edad;
}
