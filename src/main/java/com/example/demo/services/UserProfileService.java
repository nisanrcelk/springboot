package com.example.demo.services;

import com.example.demo.dtos.UserProfileCreateDto;
import com.example.demo.dtos.UserProfileDto;
import com.example.demo.entities.UserProfileEntity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public interface UserProfileService {

    List<UserProfileEntity> getUserProfiles();

    UserProfileEntity getUserProfilesById(@NotNull Long id);

    UserProfileDto getUserProfilesByUserId(@NotNull Long user_id);

    void createUserProfile(@Valid UserProfileCreateDto userProfileCreateDto);

}
