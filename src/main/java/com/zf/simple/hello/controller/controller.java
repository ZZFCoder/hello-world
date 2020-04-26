package com.zf.simple.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class controller {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
