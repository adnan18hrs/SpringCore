package com.autowire;

public class Company {

	HRDept dept;
	public Company(HRDept dept){
		this.dept=dept;
	}
	public void CompanyWork(){
		if(dept==null){
			System.out.println("No one is here to work");
		}
		else{
			dept.showHRDept();
		}
	}
}
