package com.nit.company;

public class SportsBike implements Bike {

	@Override
	public void start() {
		System.out.println("SportsBike.drive(BMW G310 RR):: Bike is started ");
	}

	@Override
	public void drive() {
		System.out.println("SportsBike.drive(BMW G310 RR):: Bike is in driving");
	}

	@Override
	public void stop() {
		 System.out.println("SportsBike.stop(BMW G310 RR):: Bike is stopped");
	}

	@Override
	public void park() {
		System.out.println("SportsBike.park(BMW G310 RR):: Bike is parking");
	}

}
