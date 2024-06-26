package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
   
	@Autowired //Has-A-Property
	private LocalDate ldt;
	
	//b.method
	public String findSeason() {
		System.out.println("SeasonFinder.findSeason()");
		//get current Month
		int month=ldt.getMonthValue();
		//show season name
		if(month>=3 && month<=6)
			return "Summer season";
		else if(month>=7 && month<=10)
			return "Rainy Season";
		else
			return "Winter Season";
	}
	
}
