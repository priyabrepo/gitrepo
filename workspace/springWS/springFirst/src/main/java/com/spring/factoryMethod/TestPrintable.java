package com.spring.factoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrintable {

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("PrintFactoryContext2.xml"); //PrintFactoryContext
		//Printable p = (Printable) context.getBean("p");
		//p.print();
		PrintableFactory pf = (PrintableFactory)context.getBean("p");
		
		pf.getPrintable();
	}

}
