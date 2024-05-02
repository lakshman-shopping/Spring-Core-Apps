package com.nit.factory;

import com.nit.comps.Bajaj;
import com.nit.comps.DieselEngine;
import com.nit.comps.ElectricEngine;
import com.nit.comps.PetrolEngine;
import com.nit.comps.Vechicle;

public class BajajFactory {
       //static factory method
	public static Bajaj getInstance(String vechicleType) {
		//create one of the dependent class obj based on the given vechicle type
		Vechicle vechicle=null;
		if(vechicleType.equalsIgnoreCase("PEv"))
			vechicle=new PetrolEngine();
		else if(vechicleType.equalsIgnoreCase("DEv"))
			vechicle=new DieselEngine();
		else if(vechicleType.equalsIgnoreCase("EEv"))
			vechicle=new ElectricEngine();
		else
			throw new IllegalArgumentException("Invalid vechicle type");
		
		//create the target class object
		Bajaj bj= new Bajaj();
		bj.setVechicle(vechicle);
		
		return bj;
	}
	
}
