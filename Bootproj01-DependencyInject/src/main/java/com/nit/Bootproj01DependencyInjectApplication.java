package com.nit;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbeans.SeasonFinder;

@SpringBootApplication
public class Bootproj01DependencyInjectApplication {
 
	@Bean("ld")
	public LocalDate createDate() {
		System.out.println("Bootproj01DependencyInjectApplication.createDate()");
		return LocalDate.now();
	}
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=SpringApplication.run(Bootproj01DependencyInjectApplication.class, args);
		
		//get  target spring bean class ref
		SeasonFinder finder = ctx.getBean("sf",SeasonFinder.class);
		
		//invoke b.method
		String seasonName = finder.findSeason();
		System.out.println("SeasonName:: "+seasonName);
		
		//close ioc container
		((ConfigurableApplicationContext)ctx).close();
	}

}
