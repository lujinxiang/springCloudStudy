package com.ljx.eurekaribbon.controller;


import com.ljx.eurekaribbon.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinxianglu
 * create 2022-06-21
 **/
@RestController
public class SayHelloController {
    @Autowired
    SayHelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
