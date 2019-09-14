package com.fairfield.event.eventfinder.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Autowired
    ApplicationConfiguration applicationConfiguration;

    public BeanConfig(){
        System.out.println(">>>>>>>>>>>>>>>>>>>");
    }
}
