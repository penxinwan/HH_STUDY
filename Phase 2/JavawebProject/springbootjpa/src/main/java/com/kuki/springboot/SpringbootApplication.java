package com.kuki.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@ServletComponentScan
@EnableCaching
public class SpringbootApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}