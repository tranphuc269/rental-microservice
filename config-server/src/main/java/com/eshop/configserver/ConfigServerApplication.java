package com.eshop.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigServer
public class ConfigServerApplication {
    @RequestMapping("/")
    public String home() {
        return "This is config server";
    }
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
