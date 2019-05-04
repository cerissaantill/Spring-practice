package com.springpractice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan
public class Config {

    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);



    }  // main method
}  // Config class
