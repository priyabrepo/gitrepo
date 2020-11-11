package com.soap.rpcStyle;

import javax.xml.ws.Endpoint;

public class HelloRPCPublisher {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1525/ws/hello", new HelloRPCImpl());
		
	}

}
