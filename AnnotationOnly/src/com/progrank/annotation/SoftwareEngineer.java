package com.progrank.annotation;

import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer implements Engineer{
	public void development(){
		System.out.println("Software Development");
	}
}
