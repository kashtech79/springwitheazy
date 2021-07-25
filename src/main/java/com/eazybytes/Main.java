package com.eazybytes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({@ComponentScan("com.eazybytes.controller"), @ComponentScan("com.eazybytes.config")})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
