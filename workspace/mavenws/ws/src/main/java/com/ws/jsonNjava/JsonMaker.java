package com.ws.jsonNjava;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;


public class JsonMaker {

	public static void main(String[] args) {

		Person prsn = new Person();
		prsn.setPayed(135000.00);
		prsn.setName("Hello Json");
		prsn.setContact("7008289389");
		
		Vehicle veh = new Vehicle();
		veh.setBrand("Yamaha");
		veh.setModel("fz");
		veh.setPrice(120000.00);
		Registration reg = new Registration("OD", 15000.00);
		veh.setReg(reg);
		
		//LinkedList for maintaining insertion order
		LinkedList<Object> list = new LinkedList<Object>();
		list.add(prsn);
		list.add(veh);
		
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
		
		ObjectWriter writer = mapper.writer();
		try {
			//to print both the objects separately
			writer.withRootName("Vehilcle wonership").withDefaultPrettyPrinter().writeValue(new File("generatedJson.json"), list);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("Generated!");
		}
	}

}
