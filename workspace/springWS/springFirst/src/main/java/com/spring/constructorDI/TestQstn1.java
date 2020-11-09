package com.spring.constructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQstn1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("configQstn1.xml");
		Questions1 q1Obj = (Questions1) context.getBean("q1");
		q1Obj.printQstn();
	}

}
