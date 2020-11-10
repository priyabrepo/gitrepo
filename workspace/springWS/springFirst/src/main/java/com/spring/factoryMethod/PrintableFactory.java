package com.spring.factoryMethod;

public class PrintableFactory {

	public static Printable getPrintable(){  
	    return new B();  
	}  
}
