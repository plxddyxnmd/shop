package com.tzsj.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUser() {
        System.out.println("hahaha");
        return "";
    }
}
