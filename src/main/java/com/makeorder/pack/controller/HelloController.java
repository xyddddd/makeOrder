package com.makeorder.pack.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private Logger logger = Logger.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String index(){
        return "Hello controller";
    }
}
