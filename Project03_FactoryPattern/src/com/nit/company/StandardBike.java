package com.nit.company;

public class StandardBike implements Bike {

	@Override
	public void start() {
		System.out.println("StandardBike.start(Splender-Plus):: Bike is started ");
		
	}

	@Override
	public void drive() {
	        System.out.println("StandardBike.drive(Splender-Plus):: Bike is in driving ");
		
	}

	@Override
	public void stop() {
	        System.out.println("StandardBike.stop(Splender-Plus):: Bike is stopped");
		
	}

	@Override
	public void park() {
		    System.out.println("StandardBike.park(Splender-Plus):: Bike is parking");
	}
        
}
