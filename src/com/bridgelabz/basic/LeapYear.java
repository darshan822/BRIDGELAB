package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("enter a 4 digit number");
		try {
		int n=Utility.readInt();
		if(n>=1000&&n<10000)
		{
		if(Utility.checkLeapYear(n))
			System.out.println("leap year");
		else
			System.out.println("not a leap year");
		}
		else
			System.out.println("invalid year");
		}
		catch (Exception e) {
			System.out.println("enter valid input in number format");
			
		}
		// TODO Auto-generated method stub

	}

}
