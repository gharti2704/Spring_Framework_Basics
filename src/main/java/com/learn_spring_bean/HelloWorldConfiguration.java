package com.learn_spring_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//With class type record, constructor, getter, and setter are automatically created.
record Person(String firstName, String lastName, int age) {};
record Address(String city, String country) {};
record PersonWithAddress(Person person, Address address) {};

@Configuration
public class HelloWorldConfiguration {

	///////////////Define methods below to create spring beans/////////////////////
	
	@Bean
	public String getFirstName() {
		return "Raju";
	}
	
	@Bean
	public String getLastName() {
		return "Gharti";
	}
	
	@Bean
	public int getAge() {
		return 38;
	}
	
	// Bean method to create Person object
	@Bean
	public Person person() {
		var newPerson = new Person("Raju", "Gharti", 38);
		
		return newPerson;
	}
	
	// We can assign custom name to beans
	@Bean(name="customName")
	public Address address() {
		Address newAddress = new Address("New York", "United States");
		
		return newAddress;
	}
	
	//Using existing beans to create new one by method call.
	@Bean(name="person2")
	public Person person2() {
		var newPerson = new Person(getFirstName(), getLastName(), 10);
		return newPerson;
	}
	
	////Using existing beans to create new one by parameter injection
	@Bean(name="personWithAddress")
	public PersonWithAddress personWithAddress(String getFirstName, String getLastName, int getAge, Address customName) {
		var newPerson = new Person(getFirstName, getLastName, getAge);
		var newPersonWithAddress = new PersonWithAddress(newPerson, customName);
		return newPersonWithAddress;
	}
}
