package com.inject.literal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext context;
	
	public static void main(String[] args){
		context= new ClassPathXmlApplicationContext("beans.xml");
		
		Employee employee=(Employee)context.getBean("employee");
		employee.showDetails();
	}
}
