package com.di;

public class Car {
	String color;
	public void showColor(){
		System.out.println("Color of car is "+color);
	}
	Engine engine;
	public Car(Engine engine){
		this.engine=engine;
		System.out.println("i am constructor from Car");
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
