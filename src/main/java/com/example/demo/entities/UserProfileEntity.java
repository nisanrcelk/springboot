package com.example.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "user_profiles")
public class UserProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    @NotEmpty
    private Long user_id;

    @Column(name = "age")
    @NotEmpty
    private Integer age;

    @Column(name = "job")
    @NotEmpty
    private String job;

    @Column(name = "about")
    @NotEmpty
    private String about;

    public Long getUser_id(){return user_id;}

    public void setUser_id(Long user_id){this.user_id=user_id;}
    public Integer getAge() { return age;}

    public void setAge(Integer age){ this.age=age;}
    public String getJob() {return job;}

    public void setJob(String job) {this.job=job;}

    public String getAbout() {return about;}

    public void setAbout(String about){this.about=about;}

    public Long getId(){return id;}

    public void setId(Long id) {this.id=id;}


}
