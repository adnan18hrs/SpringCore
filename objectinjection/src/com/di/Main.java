package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Bike bike = (Bike)ac.getBean("bike");
		bike.startEngine();
		bike.showColor();
		System.out.println("");
		
		//2 times object is created but constructor is called only 1 time bcz of beans run only 1 times
		Bike bike2 = (Bike)ac.getBean("bike");
		bike2.color="REDDD";
		bike.startEngine();
		bike.showColor();
		System.out.println("");
		
		Car car = (Car)ac.getBean("car");
		car.color="BLUE";
		car.startEngine();
		car.showColor();
		
	}
}
