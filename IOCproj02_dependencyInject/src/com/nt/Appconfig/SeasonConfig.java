package com.nt.Appconfig;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class SeasonConfig {
           @Bean(name="moy")
	     public LocalDateTime createMOY() {
	    	
	    	  return LocalDateTime.now();
	     }
}
