package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Quadraticequation {

	public static void main(String[] args) {
		System.out.println("enter value of a");// read cofficient 
    	double a=Utility.readDouble();
    	System.out.println("enter value of b");
    	double b=Utility.readDouble();
    	System.out.println("enter value of c");
    	double c=Utility.readDouble();
    	Utility.findRoot(a,b,c);
		// TODO Auto-generated method stub

	}

}
