package com.example.blog.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {
    @PostMapping("/dummy/join")
    public String join(@RequestParam String username, String password, String email){
        System.out.println("username : " + username);
       return "회원가입 완료";
    }

    @PostMapping("/dummy/join")
    public String joi2n(@RequestParam String username, String password, String email){
        System.out.println("username : " + username);
        return "회원가입 완료";
    }
}
