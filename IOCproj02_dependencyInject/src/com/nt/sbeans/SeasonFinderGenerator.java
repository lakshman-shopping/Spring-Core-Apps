package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sfg")
public class SeasonFinderGenerator {
	       @Autowired  
           private LocalDateTime datetime;
	       
	       public String showSeasonFinder(String user) {
	    	   
	    	   int month=datetime.getMonthValue();
	    	   System.out.println("printing month:-> "+month);
	    	   if(month==3 || month==4)
	    		   return "This is Spring Season "+user;
	    	   else if(month==5 || month==6)
	    		   return "This is Summer Season "+user;
	    	   else if(month==7 || month==8)
	    		   return "This is Monsoon "+user;
	    	   else if(month==9 || month==10)
	    		   return "This is Autumn "+user;
	    	   else
	    		   return "This is winter "+user;

	    				   
	       }
}
