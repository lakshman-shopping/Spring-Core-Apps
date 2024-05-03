package com.nit.main;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext  ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
	    WishMessageGenerator g1=ctx.getBean("wmg",WishMessageGenerator.class);
	    WishMessageGenerator g2=ctx.getBean("wmg",WishMessageGenerator.class);
	    
	    System.out.println(g1.hashCode()+ "  "+g2.hashCode());
	    System.out.println("g1==g2"+(g1==g2));
	    System.out.println("------------");
	    
	    Date d1 = ctx.getBean("dt1",Date.class);
	    Date d2 = ctx.getBean("dt1",Date.class);
	    System.out.println(d1.hashCode()+" "+d2.hashCode());
	    
	   /* Date d1 = ctx.getBean("dt1",Date.class);
	    Date d2 = ctx.getBean("dt1",Date.class);
	    System.out.println(d1.hashCode()+" "+d2.hashCode());*/
		//close container
		ctx.close();
		
	}

}
