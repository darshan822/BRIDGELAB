package com.practice.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadWrite {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		Read();
		
	}
	public static void Read() throws FileNotFoundException, IOException, ParseException
	{
		JSONParser parser=new JSONParser();
		Object  obj=parser.parse(new FileReader("Inventory.json"));
		JSONArray jsonarray=(JSONArray)obj;//cast the object into json array.
		Iterator itr=jsonarray.iterator();//use iterator 
		while(itr.hasNext())
		{
			JSONObject j=(JSONObject) itr.next();
			String name=(String)j.get("name");
			System.out.print(name+" inventory values ");
			int i=Integer.parseInt((String) j.get("price"));
			int i1=Integer.parseInt((String) j.get("weight"));
			System.out.println(i*i1);
		}
		
		
		
		
		
		
	}

}
