//Printer.java
package com.nit.ston;

public class Printer {
//
	private static Printer INSTANCE;
	//private constructor
	private Printer() {
		System.out.println("Printer:: 0-pram-constructor ");
	}
		//static factory method having singleton logic
		public static Printer getInstance() {
			if(INSTANCE==null) {
				INSTANCE = new Printer();
				}
			return INSTANCE;
		}
		//b.method
		public void printMessage(String msg) {
			System.out.println(msg);
		}
		
	}

