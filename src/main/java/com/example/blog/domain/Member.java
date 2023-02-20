package com.example.blog.domain;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;


@Data
public class Member {
    private int mid;
    private String userName;
    private String passWord;
    private String email;
}
