package com.scopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
	public static void main(String[] args){
		
		//this created an IOC which have many bean of differnet classes meantioned in Config class
		AbstractApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//for both object e1 & e2 only 1 object is created bcz it is singleton(its a scope of bean means only 1 object is created for 1 class in a IOC)
		Employee e1 = (Employee)con.getBean("empObj");
		e1.st = "hello";
		System.out.println(e1.st);
		
		Employee e2 = (Employee)con.getBean("empObj");
		e2.st = "Hey";
		System.out.println(e1.st);
		
		/*Employee e2 = (Employee)con.getBean("employeeObj");
		e2.st = "welcome";
		System.out.println(e1.st);
		*/
	}
}
