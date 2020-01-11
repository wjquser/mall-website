package com.mr.enreke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EnrekeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnrekeApplication.class, args);
    }

}
