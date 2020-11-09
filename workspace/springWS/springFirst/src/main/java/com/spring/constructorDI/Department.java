package com.spring.constructorDI;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Department {
	
	private String Name;
	private Map<String,String> projMap;
	
	public Department(String name, Map<String, String> projMap) {
		super();
		Name = name;
		this.projMap = projMap;
	}

	void printDept()
	{
		System.out.println("Name: "+Name);
		Set<Map.Entry<String,String>> set = projMap.entrySet();
		Iterator<Map.Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext())
		{
		   System.out.println(itr.next());
		}
	}
	
	
	

}
