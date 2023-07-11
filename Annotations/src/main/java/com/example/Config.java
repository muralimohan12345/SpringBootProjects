package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"com.example"})

public class Config {
       @Bean
       public Capacino createObj() {
       return new Capacino(); 
  }
       @Bean
       public Xpreso createObjxpre() {
    	   return new Xpreso();
       }
}
