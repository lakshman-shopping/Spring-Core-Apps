//AppConfig.java(Configuration class)
package com.nit.config;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}
	       @Bean(name="dt")
	       @Scope("singleton")
             public LocalDateTime createLDT() {
	    	   System.out.println("AppConfig.createLDT()");
            	 return LocalDateTime.now();
             }
             
	       @Bean("dt1")
	      @Scope("singleton")
	       public Date createDate() {
	    	   return new Date();
	       }
	       
	       @Bean("dt2")
	       @Scope("singleton")
	       public Date createDate1() {
	    	   return new Date();
	       }
}
