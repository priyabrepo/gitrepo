package com.spring.constructorDI;

import java.util.Iterator;
import java.util.List;

public class Questions {
	
	private Integer no;
	private String qn;
	private List<String> choices;
	public Questions(Integer no, String qn, List<String> choices) {
		super();
		this.no = no;
		this.qn = qn;
		this.choices = choices;
	}
	
	void printQ()
	{
		System.out.println(no+"."+ qn);
		Iterator<String> itr = choices.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	

}
