package com.example.blog.controller;

import com.example.blog.domain.Member;
import io.swagger.annotations.ApiModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test/hello")
    public String test(Member m){    return  "mid = "+ m.getMid(); }

}
