package com.example.demo.controllers;

import com.example.demo.dtos.UserCreateDto;
import com.example.demo.dtos.UserDto;
import com.example.demo.entities.UserEntity;
import com.example.demo.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getUsers(){
        return userService.getUsers();
    }

    @GetMapping(value = "/{id}")
    public UserEntity getUsersById(@PathVariable(value = "id") Long id){
        return userService.getUsersById(id);
    }

    @GetMapping(value = "/findByEmail/{email}")
    public UserDto getUsersByEmail(@PathVariable(value = "email") String email){
        return userService.getUsersByEmail(email);
    }

    @PostMapping
    public void createUser(@Valid @RequestBody UserCreateDto userCreateDto){
        userService.createUser(userCreateDto);
    }


}
