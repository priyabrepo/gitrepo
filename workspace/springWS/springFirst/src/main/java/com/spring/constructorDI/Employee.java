package com.spring.constructorDI;

public class Employee {
	
	private Integer id;
	private String name;
	
	public Employee(){
		System.out.println("Default constructor");
	}
	
	public Employee(int id){
		this.id = id;
	}
	
	public Employee(String name){
		this.name = name;
	}
	
	public Employee(Integer id,String name){
		this.name = name;
		this.id = id;
	}
	
	void empDetails()
	{
		System.out.println(id+" : "+ name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	

}
