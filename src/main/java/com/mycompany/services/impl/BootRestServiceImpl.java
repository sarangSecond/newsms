package com.mycompany.services.impl;

import com.mycompany.services.interfaces.BootRestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sarangj on 25/08/2017.
 */
@RestController
@EnableAutoConfiguration
public class BootRestServiceImpl implements BootRestService {

    @RequestMapping("/")
    String home(){
        return "Spring Boot And Microservices";
    }

    public static void main(String[] args){
        SpringApplication.run(BootRestServiceImpl.class,args);
    }
}
