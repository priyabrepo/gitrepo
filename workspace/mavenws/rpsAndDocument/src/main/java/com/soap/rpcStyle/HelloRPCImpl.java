package com.soap.rpcStyle;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soap.rpcStyle.HelloRPC")
public class HelloRPCImpl implements HelloRPC {

	public String helloRPC(String name) {
		return "Hello RPC :" + name;
	}

}
