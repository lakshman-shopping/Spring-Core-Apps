package com.nit.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")

public final class Flipkart {
    //Has- a property
	@Autowired
	@Qualifier("dtdc")
	private Courier courier;
	
	//b.method
	public String shopping(String items[], double prices[]) {
		//generate the bilAmount
		double billAmount=0.0;
		for(double p: prices) {
			 billAmount = billAmount+p;
		}
		//generate order id randomly
		int oid = new Random().nextInt(100000);
		
		String msg = courier.deliver(oid);
		
		return Arrays.toString(items)+" are shopping having bil amount: "+billAmount+" ____ "+msg;
	}
}
