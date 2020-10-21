package com.progrank.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	@Autowired
	//qualifier is used for injecting software engineer class
	@Qualifier("softwareEngineer")
	Engineer engineer;

	public void showInfo(){
		System.out.println("All Details");
	}
}
