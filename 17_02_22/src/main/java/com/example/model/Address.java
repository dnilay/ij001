package com.example.model;

public class Address {
	private String addressLine1;
	private String addressLine2;
	public Address() {
		
	}
	public Address(String addressLine1, String addressLine2) {
		
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
	}
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + "]";
	}
	

}
