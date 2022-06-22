package com.ljx.eurekaribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author jinxianglu
 * create 2022-06-21
 **/
@Service
public class SayHelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
    }


}
