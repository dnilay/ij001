package com.example.model;

public class Person {
	
	private String personName;
	
	private Address address;

	public Person() {
		
	}

	public Person(String personName, Address address) {
		super();
		this.personName = personName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", address=" + address + "]";
	}
	
	

}
