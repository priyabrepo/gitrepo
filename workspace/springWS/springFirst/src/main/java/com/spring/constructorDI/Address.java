package com.spring.constructorDI;

public class Address {
	
	private String city;
	private String State;
	private String Country;
	
	public Address(String city, String state, String country) {
		this.city = city;
		this.State = state;
		this.Country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", Country=" + Country + "]";
	}
	
	

	

}
