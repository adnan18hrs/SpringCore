package com.id;

public class Bike {
	String color;
	
	//public Bike(String color){
		//this.color = color;
	//}
		
	public Bike(){
		System.out.println("Object has been created");
	}
			
	public void setColor(String color){
		this.color = color;
	}
	
	public void showColor(){
		System.out.println("Color of bike is = "+color);
	}
}