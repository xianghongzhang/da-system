package com.hongzhang.da.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xiang Hongzhang
 * @date 2021/05/13
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
