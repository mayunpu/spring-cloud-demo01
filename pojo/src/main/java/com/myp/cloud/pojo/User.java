package com.myp.cloud.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    public User(int age, String name, Date birthday) {
        this.age = age;
        this.name = name;
        this.birthday = birthday;
    }

    private int age;
    private String name;
    private Date birthday;
}
