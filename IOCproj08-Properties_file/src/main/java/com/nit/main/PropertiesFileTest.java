package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.Config.AppConfig;
import com.nit.sbeans.PersonalInfo;

public class PropertiesFileTest {

	public static void main(String[] args) {
		//create IOC Container
		AnnotationConfigApplicationContext ctx=new 
				AnnotationConfigApplicationContext(AppConfig.class);
		
		//get spring bean class obj ref
		PersonalInfo info=ctx.getBean("pInfo",PersonalInfo.class);
		System.out.println(info);
		
		//close IOC container
		ctx.close();
	}

}
