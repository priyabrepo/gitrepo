package com.spring.constructorDI;

public class Person {
	
	private Integer id ;
	private String name ;
	private Address address ;
	
	public Person(Integer id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void printDetails()
	{
		System.out.println(id+":"+name);
		System.out.println(address.toString());
	}
	

}
