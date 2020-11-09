package com.spring.constructorDIInherit;

import com.spring.constructorDI.Address;

public class Person {

		private String Name;
		private Address adrs;
		
		public Person(String name) {
			this.Name = name;
		}
		
		public Person(String name, Address adrs) {
			this.Name = name;
			this.adrs = adrs;
		}
		@Override
		public String toString() {
			return "Person [Name=" + Name + ", adrs=" + adrs + "]";
		}
		
		
		
		
		

}
