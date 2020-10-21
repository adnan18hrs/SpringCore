package com.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean
	//@Scope
	public Employee empObj(){
		return new Employee();
	}
	
	@Bean
	public Employee employeeObj(){
		return new Employee();
	}
}
