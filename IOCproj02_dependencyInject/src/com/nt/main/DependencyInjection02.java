package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Appconfig.SeasonConfig;
import com.nt.sbeans.SeasonFinderGenerator;

public class DependencyInjection02 {

	public static void main(String[] args) {
		//create IOC Container
		AnnotationConfigApplicationContext  ctx = 
				new AnnotationConfigApplicationContext(SeasonConfig.class);
		//get target spring bean class obj from the container
		SeasonFinderGenerator generator = ctx.getBean("sfg",SeasonFinderGenerator.class); //getbean(-,-) 
		
		      //invoke method
				String resultMsg = generator.showSeasonFinder("lakshman");
				System.out.println(resultMsg);
				//close container
				ctx.close();
	}

}
