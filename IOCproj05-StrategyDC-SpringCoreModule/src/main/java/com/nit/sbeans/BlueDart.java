package com.nit.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bDart")
@Primary
public class BlueDart implements Courier {
         public BlueDart() {
        	 System.out.println("BlueDart: 0-param constructor");
         }
	@Override
	public String deliver(int oid) {
		   
		return " BlueDart courier is ready to deliver "+oid+" order number products";
	}

}
