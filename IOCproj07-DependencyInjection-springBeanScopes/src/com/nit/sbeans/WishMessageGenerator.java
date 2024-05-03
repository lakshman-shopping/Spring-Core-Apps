//wishMessageGenrator(target class)
package com.nit.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
public class WishMessageGenerator {
	 @Autowired//field injection
	 //@Qualifier("dt")
	 private LocalDateTime datetime; //Has-A property/ field
	     
	  @Autowired
	  @Qualifier("dt1")
	  private Date date;
	      /*  @Autowired
          public void setLdt(LocalDateTime datetime) {
        	  System.out.println("WishMessageGenerator.setDateTime()");
        	  this.datetime=datetime;
          }*/
         
          public WishMessageGenerator() {
        	  System.out.println("WishMessageGenerator::0-param-constructor");
          }
         
        /* @Autowired
         public WishMessageGenerator(LocalDateTime datetime, Date dt) {
       	  System.out.println("WishMessageGenerator:: 2-param constructor");
       	  this.datetime=datetime;
       	  this.dt=dt;
         }
	      //b.method having b.logic
	      public String showWishMessage(String user) {
	    	  //get current hour of the day
	    	  int hour=datetime.getHour();
	    	  //generate the wishMessage
	    	  if(hour<12)
	    		  return "Good Morning "+user;
	    	  else if(hour<16)
	    		  return "Good afternoon "+user;
	    	  else if(hour<20)
	    		  return "Good evening "+user;
	    	  else
	    		  return "Good Night "+user;
	      }*/
}
