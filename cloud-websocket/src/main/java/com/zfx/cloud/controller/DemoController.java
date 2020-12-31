package com.zfx.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/ts")
    public String demo(){
        return "hahahaaaaaaaaaaaaaaaaa";
    }
}
