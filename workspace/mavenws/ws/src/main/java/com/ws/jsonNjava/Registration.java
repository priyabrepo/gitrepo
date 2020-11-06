package com.ws.jsonNjava;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Registration {

	@JsonProperty("RTO Name")
	private String rto;
	@JsonProperty("Registration amount")
	private Double fee;
	
	
	public Registration(String rto, Double fee) {
		super();
		this.rto = rto;
		this.fee = fee;
	}


	@Override
	public String toString() {
		return "Registration [rto=" + rto + ", fee=" + fee + "]";
	}

	
	

}
