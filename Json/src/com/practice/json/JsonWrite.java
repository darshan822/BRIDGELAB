package com.practice.json;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
class JsonWrite{
	public static void main(String[] args) {//to write a data into the json file
		JSONObject obj=new JSONObject();
		obj.put("name", "darshan");
		obj.put("lastname", "naik");
		JSONArray list=new JSONArray();
		list.add("java");
		list.add("jsp");
		list.add("servelet");
		obj.put("course",list);
		System.out.println(obj);
		try (FileWriter file = new FileWriter("darshannaik.json")) {
			 
            file.write(obj.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
	}
}