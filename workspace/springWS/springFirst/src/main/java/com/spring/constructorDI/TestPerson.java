package com.spring.constructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("PersonContext.xml");
		Person person = (Person) context.getBean("PersonId");
		
		person.printDetails();
	}

}
