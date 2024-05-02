//Bajaj.java (target class)
package com.nit.comps;
import java.util.Arrays;
import java.util.Random;
public final class Bajaj {
	
	//Has-A property
     private Vechicle vechicle;
     
     public Bajaj() {
    	 System.out.println("Bajaj:: 0-param constructor");
     }
     public void setVechicle(Vechicle vechicle) {
    	 System.out.println("Bajaj.setVechicle()");
    	 this.vechicle=vechicle;
     }
     //b.method
     public String onlineStore(String products[], double prices[] ) {
    	 System.out.println("Bajaj.onlineStore()");
    	 //calculate bill Amount
    	 double billAmount=0.0;
    	 for(double p: prices) {
    		 billAmount=billAmount+p;
    	 }
    	 //generate order is randomly
    	 int oid=new Random().nextInt(500000);
    	 //deliver the order 
    	 String msg=vechicle.deliver(oid);
    	 return Arrays.toString(products)+" products order with bilAmount "+billAmount+"____"+msg;
     }
}
