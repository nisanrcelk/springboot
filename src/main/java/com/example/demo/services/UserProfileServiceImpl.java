package com.example.demo.services;

import com.example.demo.UserProfileRepository;
import com.example.demo.dtos.UserProfileCreateDto;
import com.example.demo.dtos.UserProfileDto;
import com.example.demo.entities.UserProfileEntity;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;
    @Override
    public List<UserProfileEntity> getUserProfiles() {
      return userProfileRepository.findAll();
    }

    @Override
    public UserProfileEntity getUserProfilesById(@NotNull Long id) {
        Optional<UserProfileEntity> profile = userProfileRepository.findById(id);
        if (profile.isEmpty()) {
            return null;
        }
        return profile.get();
    }

    @Override
    public UserProfileDto getUserProfilesByUserId(@NotNull Long user_id) {
        Optional<UserProfileEntity> profile=userProfileRepository.findByUserId(user_id);
        if(profile.isEmpty()){return null;}
        UserProfileDto userProfileDto=new UserProfileDto();
        userProfileDto.setJob(profile.get().getJob());
        userProfileDto.setAbout(profile.get().getAbout());
        userProfileDto.setUser_id(profile.get().getUser_id());
        userProfileDto.setAge(profile.get().getAge());
        return userProfileDto;
    }

    @Override
    public void createUserProfile(UserProfileCreateDto userProfileCreateDto) {
        UserProfileEntity userProfileEntity=new UserProfileEntity();
        userProfileEntity.setAbout(userProfileCreateDto.getAbout());
        userProfileEntity.setJob(userProfileCreateDto.getJob());
        userProfileEntity.setUser_id(userProfileCreateDto.getUser_id());
        userProfileEntity.setAge(userProfileCreateDto.getAge());
        userProfileRepository.save(userProfileEntity);

    }
}
