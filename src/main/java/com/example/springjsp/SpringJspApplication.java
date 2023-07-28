package com.example.springjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.springjsp.entity")
public class SpringJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJspApplication.class, args);
    }

}
