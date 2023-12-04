package com.learn_spring_bean.hello_world;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpringBean {
	
	public static void main(String[] args) {
		
		try (
			//Create spring application context also called SPRING CONTAINER or SPRING IOC CONTAINER using HelloWorlConfiguration
			var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)
		) {
			// Get the name object
			var firstName = context.getBean("getFirstName");
			var lastName = context.getBean("getLastName");
			System.out.println("My name is " + firstName + " " + lastName);
			
			var raju = context.getBean("person");
			System.out.println(raju);
			
			var myAddress = context.getBean("customName");
			System.out.println(myAddress);
			
			//Retrieve bean by its type
			var myAddressAgain = context.getBean(Address.class);
			System.out.println(myAddressAgain);
			
			var person = context.getBean("person");
			System.out.println(person);
			
			var personWithAddress = context.getBean(PersonWithAddress.class);
			System.out.println(personWithAddress);
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
