package com.ws.ReadJson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadJSON {

	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		ArrayList<String> values = new ArrayList<String>();
		ArrayList<String> key = new ArrayList<String>();

		JSONParser parser = new JSONParser();

		Object obj = parser.parse(new FileReader("generatedJson.json"));

		JSONObject jobj = (JSONObject) obj;

		JSONArray companyList = (JSONArray) jobj.get("Vehilcle wonership");

		@SuppressWarnings("unchecked")
		Iterator<JSONObject> iterator = companyList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
	}

}
