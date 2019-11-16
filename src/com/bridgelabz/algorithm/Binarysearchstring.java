package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;

public class Binarysearchstring {
		public static void main(String[] args) {
	    System.out.println("enter the string");
	    String s=Utility.readString();
	    System.out.println("enter the word to check");
	    String value=Utility.readString();
	    int count;
	    int i=0;
	    count=Utility.countWords(s);//calculate word in string
	    String[] str=new String[count];
	    for(String s1:s.split(" "))//split string into string array y space
	    {
	    	str[i]=s1;
	    	i++;
	    }
	   str=Utility.sortStringArray(str);//sort string array
	    if(Utility.binarySearch(str,value))//check inary search
	    	System.out.println("present");
	    else
	    	System.out.println("not present");
	    
	    
		// TODO Auto-generated method stub

	}
	
}