package com.spring.constructorDIInherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrsn {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context =  new ClassPathXmlApplicationContext("InheritBeanContext.xml");
		
		Person prsn = (Person)context.getBean("prsnBeanInheriting");  //prsnBean
		System.out.println(prsn.toString());
	}

}
