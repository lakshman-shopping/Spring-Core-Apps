package com.nit.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("voter")
public class VoterDetailsService {
@Value("${voter.id}")
	private Integer vid;
@Value("${voter.name}")
	private String name;
@Value("${voter.addrs}")
	private String addrs;
@Value("${voter.age}")	
private Integer age;
	private Date dov;
    public VoterDetailsService() {
    	System.out.println("voterdetailsservice:: 0-pram-constructor");
    }
	//custom init() method
    @PostConstruct
    public void myInit() {
    	System.out.println(" VoterDetailsService.myInit()");
    	//check wether important properties are injcted with correct value or not
    	if(name==null || name.length()==0 || name.equals("") || age==null || age<=0)
    	     throw new IllegalArgumentException("person name, age are not given properly");
    	//Initialize lft over properties
    	dov=new Date();
    	
    	
    }
    public String checkVotingElgibility(){
    	System.out.println("VoterDetailsService.checkVotingElgibility()");
    	if(age<18)
    		return " Mr./Miss./Mrs."+name+" you are not elgible for voting---> verfied on:: "+dov;
    	else 
            return " Mr./Miss./Mrs."+name+" you are elgible for voting---> verfied on:: "+dov;
    }
    @PreDestroy
    public void myDestroy() {
		System.out.println("VoterDetailsService.myDestroy()");
		vid=null;
		name=null;
		addrs=null;
		age=null;
		dov=null;
		
		
	}
}
