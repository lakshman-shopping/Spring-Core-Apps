package com.nit.Factory;

import com.nit.company.Bike;
import com.nit.company.ElectricBike;
import com.nit.company.SportsBike;
import com.nit.company.StandardBike;

public class BikeFactory {
           //static factory method having factory logic
	     public static Bike orderBike(String type) {
	    	 Bike bike=null;
	    	 if(type.equalsIgnoreCase("standard"))
	    		 return new StandardBike();
	    	 else if(type.equalsIgnoreCase("sports"))
	    		 return new SportsBike();
	    	 else if(type.equalsIgnoreCase("electric"))
	    		 return new ElectricBike();
	    	 else
	    		 throw new IllegalArgumentException("Invalid bike type");
	     }
}
