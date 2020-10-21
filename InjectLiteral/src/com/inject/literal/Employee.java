package com.inject.literal;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	//@value("${employee.name}")
	private String empName;
	

	//@value("${employee.id}")
	private String empId;
	

	//@value("${employee.skills}")
	private String empSkills;
	
	public void showDetails(){
		System.out.println("Employee name is "+empName);
		System.out.println("Employee ID is "+empId);
		System.out.println("Employee skills is "+empSkills);
	}
}
