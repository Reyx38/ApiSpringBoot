package com.reyphill.ApiSpringBoot.controllers;

import com.reyphill.ApiSpringBoot.dto.common.Response;
import com.reyphill.ApiSpringBoot.dto.user.UserRequestDto;
import com.reyphill.ApiSpringBoot.dto.user.UserResponseDto;
import com.reyphill.ApiSpringBoot.services.UserServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UserController {
    @Autowired
    private UserServices userServices;

    @PostMapping
    public ResponseEntity<Response<UserResponseDto>> postUser(@Valid  @RequestBody UserRequestDto requestDto) {
        UserResponseDto user = userServices.insertUser(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new Response<>(
                true,
                "Usuario creado correctamente",
                user
        ));
    }

    @GetMapping
    public List<UserResponseDto> getUsers(){return userServices.listUser();}

    @GetMapping ("/{id}")
    public UserResponseDto getUserById(@PathVariable int id) {return userServices.getUserById(id);}

    @PutMapping("{id}")
    public ResponseEntity<Response<UserResponseDto>> updateUser (    @Valid
                                                                     @PathVariable int id,
                                                                     @RequestBody UserRequestDto requestDto){

        UserResponseDto response = userServices.updateUser(id,requestDto);
        return ResponseEntity.ok(
                new Response<>(
                        true,
                        "Usuario creado correctamente",
                        response
                )
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response<Void>> deleteUser(@PathVariable int id){
        userServices.deleteUser(id);

        return ResponseEntity.ok(
                new Response<>(
                        true,
                        "usuario eliminado correctamente",
                        null
                )
        );
    }

}
