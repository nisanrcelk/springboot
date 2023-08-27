package com.example.demo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class UserProfileCreateDto {

    @NotNull
    @NotBlank
    @NotEmpty
    private String job;

    @NotEmpty
    @NotNull
    @NotBlank
    private String about;

    @NotEmpty
    @NotNull
    @NotBlank
    private Long user_id;

    @NotEmpty
    @NotNull
    @NotBlank
    private Integer age;


    public UserProfileCreateDto(String job, String about, Long user_id,Integer age){
        this.job=job;
        this.about=about;
        this.user_id=user_id;
        this.age=age;


    }

    public String getJob(){return job;}
    public void setJob(String job){this.job=job;}

    public String getAbout(){return  about;}
    public void setAbout(String about){this.about=about;}

    public Long getUser_id(){return user_id;}

    public void setUser_id(Long user_id){this.user_id=user_id;}

    public Integer getAge(){return  age;}
    public void setAge(Integer age){this.age=age;}
}
