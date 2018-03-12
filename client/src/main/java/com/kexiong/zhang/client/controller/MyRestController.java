package com.kexiong.zhang.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Value("${ip}")
    public String ip;

    @RequestMapping("/hi")
    public String getIp(){
        return ip;
    }
}
