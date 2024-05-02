package com.nit.client;

import com.nit.comps.Bajaj;
import com.nit.factory.BajajFactory;

public class UserStrategy {

	public static void main(String[] args) {
		//use factory pattern to target obj
		Bajaj bj = BajajFactory.getInstance("DEv");
		
		
		//Bajaj bj1 = BajajFactory.getInstance("EEv");
		
		
		//Bajaj bj2 = BajajFactory.getInstance("PEv");
		//invoke the b.method
		String resultMsg=bj.onlineStore(new String[] {"KeyaCar", "BMWCar", "PowerCar"},
				new double[] {250000.0,400000.0,350000.0});
		System.out.println(resultMsg);
	}

}
