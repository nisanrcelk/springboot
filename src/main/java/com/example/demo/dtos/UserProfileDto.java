package com.example.demo.dtos;

public class UserProfileDto {

    private String job;
    private String about;
    private Long user_id;
    private Integer age;


    public String getJob(){return job;}

    public void setJob(String job){this.job=job;}
    public Integer getAge(){return age;}

    public void setAge(Integer age){this.age=age;}

    public String getAbout(){return about;}
    public void setAbout(String about){this.about=about;}

    public Long getUser_id(){return user_id;}

    public void setUser_id(Long user_id){this.user_id=user_id;}

}
