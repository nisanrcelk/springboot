package com.example.demo.services;

import com.example.demo.UserRepository;
import com.example.demo.dtos.UserCreateDto;
import com.example.demo.dtos.UserDto;
import com.example.demo.entities.UserEntity;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;
    @Override
    public List<UserEntity> getUsers() {
        return repository.findAll();
    }

    @Override
    public UserEntity getUsersById(Long id) {
        Optional<UserEntity> user = repository.findById(id);

        if (user.isEmpty()){
            return null;
        }

        return user.get();
    }

    @Override
    public UserDto getUsersByEmail(String email) {
        Optional<UserEntity> user = repository.findByEmail(email);

        if (user.isEmpty()){
            return null;
        }

        UserDto userDto = new UserDto();
        userDto.setEmail(user.get().getEmail());
        userDto.setFirstName(user.get().getFirstName());

        return userDto;
    }

    @Override
    public void createUser(UserCreateDto userCreateDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userCreateDto.getEmail());
        userEntity.setFirstName(userCreateDto.getFirstName());

        repository.save(userEntity);
    }


}
