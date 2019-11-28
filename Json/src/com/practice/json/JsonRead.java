package com.practice.json;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class JsonRead {//to read the json data from the json file
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(new FileReader("darshannaik.json"));
		JSONObject jsonobject=(JSONObject)obj;
		String name=(String)jsonobject.get("name");
		System.out.println(name);
		String lastname=(String)jsonobject.get("lastname");
		System.out.println(lastname);
		System.out.println("The course taken are");
		JSONArray course=(JSONArray)jsonobject.get("course");//take json array to take value from key course.it return json array
		Iterator itr=course.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
		}

}
