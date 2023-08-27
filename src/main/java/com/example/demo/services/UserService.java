package com.example.demo.services;

import com.example.demo.dtos.UserCreateDto;
import com.example.demo.dtos.UserDto;
import com.example.demo.entities.UserEntity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public interface UserService {

    List<UserEntity> getUsers();

    UserEntity getUsersById(@NotNull Long id);

    UserDto getUsersByEmail(@NotNull String email);

    void createUser(@Valid UserCreateDto userCreateDto);


}
