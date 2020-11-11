package com.soap.rpcStyle;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class HelloRPCClient {

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("http://localhost:1525/ws/hello?wsdl");
		
		QName qname =  new QName("http://javatpoint.com/", "HelloWorldImplService");  
		Service service = Service.create(url,qname);
		HelloRPC hello = service.getPort(HelloRPCImpl.class);
		System.out.println(hello.helloRPC("Priyabratta"));
	}

}
