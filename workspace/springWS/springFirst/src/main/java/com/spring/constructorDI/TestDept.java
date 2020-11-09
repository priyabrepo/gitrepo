package com.spring.constructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDept {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

	 ApplicationContext context = new ClassPathXmlApplicationContext("DepartmentConfig.xml");
	 Department dept = (Department) context.getBean("deptBean");
	 
	 dept.printDept();
	}

}
