package com.example.demo.controllers;


import com.example.demo.entities.UserProfileEntity;
import com.example.demo.services.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user-profiles")
public class UserProfileController {

    //Sınıflar arasındaki bağımlılıkları yönetmek ve nesne örneklerini otomatik olarak enjekte etmek için kullanılır.
    @Autowired
    private UserProfileService userProfileService;

    @GetMapping
    public List<UserProfileEntity> getUserProfiles(){
        return userProfileService.getUserProfiles();

    }
}
