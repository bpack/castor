package com.ioglyph.castor.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ioglyph.castor")
public class CastorServer {
    public static void main(String[] args){
        SpringApplication.run(CastorServer.class, args);
    }
}
