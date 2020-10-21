package com.di;

public class Bike {
	String color;
	public void showColor(){
		System.out.println("Color of bike is "+color);
	}
	Engine engine;
	public Bike(Engine engine){
		this.engine=engine;
		System.out.println("i am constructor from Bike");
	}
	public void startEngine(){
		if(engine==null){
			System.out.println("Object is not created");
		}
		else{
			engine.start();	
		}
	}
	
	
}
