package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("enter string1");
		String s1=Utility.readString();
		System.out.println("enter string2");
		String s2=Utility.readString();
		System.out.println(Utility.bubbleSortString(Utility.lowerCase(Utility.removeSpace(s1))));
		System.out.println(Utility.bubbleSortString(Utility.lowerCase(Utility.removeSpace(s2))));
		s1=Utility.lowerCase(Utility.removeSpace(s1));
		s2=Utility.lowerCase(Utility.removeSpace(s2));
		s1=Utility.bubbleSortString(s1);
		s2=Utility.bubbleSortString(s2);
		System.out.println(Utility.compare(s1,s2));
		if(Utility.compare(s1,s2))
			System.out.println("anagram");
		else
			System.out.println("not angram");
		
		// TODO Auto-generated method stub

	}

}
