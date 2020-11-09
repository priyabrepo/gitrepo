package com.spring.constructorDI;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Company {
	
	private String name;
	private Map<Employee,Address> empDetails;
	
	public Company(String name, Map<Employee, Address> empDetails) {
		super();
		this.name = name;
		this.empDetails = empDetails;
	}
	
	void PrintComp()
	{
		System.out.println("Company Name: "+name);
		System.out.println("******************");
		Set<Entry<Employee,Address>> set = empDetails.entrySet();
		Iterator<Map.Entry<Employee,Address>> itr = set.iterator();
		
		while(itr.hasNext())
		{
			Entry<Employee,Address> entry = itr.next();
			Employee emp = entry.getKey();
			Address adrs = entry.getValue();
			System.out.print(emp.toString());
			System.out.print(" : ");
			System.out.print(adrs.toString());
			System.out.println();
		}
		
	}
	

}
