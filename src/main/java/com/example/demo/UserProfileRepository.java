package com.example.demo;

import com.example.demo.entities.UserProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfileEntity,Long> {

    @Query(value = "SELECT u from UserProfileEntity u where u.user_id=:user_id")
    //optional
    Optional<UserProfileEntity> findByUserId(@Param(value = "user_id")Long user_id);
}
