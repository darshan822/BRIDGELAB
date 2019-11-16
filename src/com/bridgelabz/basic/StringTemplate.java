package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;

public class StringTemplate {

	public static void main(String[] args) {
		
		System.out.println("enter string template");
		String s=Utility.readString();
		System.out.println("enter a word u want to replace");
		String s1=Utility.readString();
		System.out.println("enter word u want to repalce with");
		String s2=Utility.readString();
		s=Utility.replace(s,s1,s2);
		System.out.println(s);
		
		// TODO Auto-generated method stub

	}

}
