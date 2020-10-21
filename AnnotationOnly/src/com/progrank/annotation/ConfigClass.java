package com.progrank.annotation;
//ANNOTATION ONLY
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//it will check all the class inside a package one by one to inject
@Configuration
@ComponentScan(basePackages = "com.progrank.annotation")
public class ConfigClass {
	
//	 here @bean won't scan for all the classes & pick only required one that is Company class
//	 @Bean
//	 public SoftwareEngineer engineerObj(){
//		 return new SoftwareEngineer();
//	 }
//	 
//	 @Bean
//	 public Company company(){
//		 return new Company(engineerObj());
//	 }
}
