package com.spring.constructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("CompnyContext.xml");
		Company comp = (Company)context.getBean("compBean");
		comp.PrintComp();
	}

}
