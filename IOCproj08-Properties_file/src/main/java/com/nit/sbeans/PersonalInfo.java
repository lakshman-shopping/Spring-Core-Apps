package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pInfo")
public class PersonalInfo {
   @Value("9652857451")  //direct inject the value
   private long phno;

   //to inject the value collect from properties file
   @Value("${per.id}")
	private Integer pid;
   @Value("${per.name}")
	private String pname;
   @Value("${per.addrs}")
	private String addrs;
	
   //to inject the system Properties file
   @Value("${os.name}")
   private String osName;
   @Value("${os.version}")
   private String osVer;
   
   //to inject the value of the Envinornment variables
   @Value("${Path}")
   private String pathData;

   //toString()
@Override
public String toString() {
	return "PersonalInfo [phno=" + phno + ", pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + ", osName="
			+ osName + ", osVer=" + osVer + ", pathData=" + pathData + "]";
}
   
}
