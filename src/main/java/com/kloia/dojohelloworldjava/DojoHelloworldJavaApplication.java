package com.kloia.dojohelloworldjava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DojoHelloworldJavaApplication {

    @Value("${hello.env}")
    private String env;
    public static void main(String[] args) {
        SpringApplication.run(DojoHelloworldJavaApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String name() {
        return env;
    }
}
