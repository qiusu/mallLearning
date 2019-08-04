package com.macro.mall.tiny.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hi")
    public String getInfo(){
        return "hi";
    }
}
