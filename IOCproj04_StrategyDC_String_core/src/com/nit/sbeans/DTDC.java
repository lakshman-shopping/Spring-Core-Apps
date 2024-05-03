package com.nit.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Primary
public class DTDC implements Courier {
	
         public DTDC() {
        	 System.out.println("DTDC: 0-param constructor");
         }
	@Override
	public String deliver(int oid) {
		   
		return " DTDC courier is ready to deliver "+oid+" order number products";
	}

}
