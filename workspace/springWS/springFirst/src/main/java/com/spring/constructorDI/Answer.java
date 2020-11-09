package com.spring.constructorDI;

public class Answer {

	private String sl;
	private String ansr;
	public Answer(String sl, String ansr) {
		super();
		this.sl = sl;
		this.ansr = ansr;
	}
	@Override
	public String toString() {
		return "Answer [sl=" + sl + ", ansr=" + ansr + "]";
	}
	
	
	
	
}
