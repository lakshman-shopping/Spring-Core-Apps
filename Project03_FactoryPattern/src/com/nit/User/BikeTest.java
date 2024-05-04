package com.nit.User;

import com.nit.Factory.BikeFactory;
import com.nit.company.Bike;

public class BikeTest {
	
          public static void main(String[] args) {
        	// get bike object
        	  Bike bike1=BikeFactory.orderBike("standard");
        	  bike1.start(); bike1.drive(); bike1.stop(); bike1.park();
        	  System.out.println("__________");
        	  
        	  Bike bike2=BikeFactory.orderBike("sports");
        	  bike2.start(); bike2.drive(); bike2.stop(); bike2.park();
        	  System.out.println("__________");
        	  
        	  Bike bike3=BikeFactory.orderBike("electric");
        	  bike3.start(); bike3.drive(); bike3.stop(); bike3.park();
        	
        	  
		}
}
