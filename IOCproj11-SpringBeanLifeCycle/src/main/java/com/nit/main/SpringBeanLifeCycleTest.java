package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.Config.AppConfig;
import com.nit.sbeans.VoterDetailsService;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		//to get spring bean obj class ref
		VoterDetailsService service = ctx.getBean("voter",VoterDetailsService.class);
		
		String result = service.checkVotingElgibility();
		System.out.println(result);
		//close IOC container
		ctx.close();
		
	}

}
