package com.spring.constructorDI;

import java.util.Iterator;
import java.util.List;

public class Questions1 {
	
	private Integer qNo;
	private String qstn;
	private List<Answer> ansList;
	
	public Questions1(Integer qNo, String qstn, List<Answer> ansList) {
		super();
		this.qNo = qNo;
		this.qstn = qstn;
		this.ansList = ansList;
	}
	
	void printQstn()
	{
		System.out.println(qNo+". "+qstn);
		Iterator<Answer> itr = ansList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	

}
