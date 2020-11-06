package com.ws.jsonNjava;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//By default Jackson does not ignore Null and Empty fields while writing JSON.so @JsonInclude(value = Include.NON_NULL) feels useless.
@JsonIgnoreProperties(ignoreUnknown = true)

public class Person {
	@JsonProperty("Buyer")
	private String name ;
	
	@JsonProperty("Contact")
	private String contact ;
	
	@JsonProperty("Total payed")
	private Double payed;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Double getPayed() {
		return payed;
	}
	public void setPayed(Double payed) {
		this.payed = payed;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", contact=" + contact + ", balance=" + payed + "]";
	}
	
	
	
	
}
