package com.nit.company;

public class ElectricBike implements Bike {

	@Override
	public void start() {
		System.out.println("ElectricBike.drive(Ather):: Bike is started ");
	}

	@Override
	public void drive() {
	   System.out.println("ElectricBike.drive(Ather):: Bike is in driving ");

	}

	@Override
	public void stop() {
		  System.out.println("ElectricBike.stop(Ather):: Bike is stopped");

	}

	@Override
	public void park() {
		System.out.println("ElectricBike.park(Ather):: Bike is parking" );

	}

}
