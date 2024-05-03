package com.nit.Client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.AppConfig.AppConfig;
import com.nit.sbeans.Flipkart;

public class StrategyDCTest {

	public static void main(String[] args) {
		//create IOC Container
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		//get target spring bean class obj reference
		Flipkart fpkt = ctx.getBean("fpkt",Flipkart.class);
		//invoke the b.method
		String resultMsg = fpkt.shopping(new String[] {"Mobile","AC"},
				new double[] {34000.0,40000.0});
		System.out.println(resultMsg);
		//close the container
		ctx.close();
	}

}
