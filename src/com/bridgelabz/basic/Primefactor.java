package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;

public class Primefactor {

	public static void main(String[] args) {
		System.out.println("enter value of n");
		try {
		int n=Utility.readInt();
		Utility.primeFactor(n);
		}
		catch (Exception e) {
			System.out.println("enter valid input");
			
		}
		
		// TODO Auto-generated method stub

	}

}
