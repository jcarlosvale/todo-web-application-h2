package com.in28minutes.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
/*
When you want to deploy a Spring Boot Application as a WAR, it's necessary to extends the SpringBootServletInitializer
and override the "configure" method.
Please, remove the Tomcat Server from the dependencies and uses an external. (look the pom.xml)
 */
public class SpringBootFirstWebApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootFirstWebApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFirstWebApplication.class, args);
    }

}
