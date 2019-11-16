package com.bridgelabz.basic;
import com.bridgelabz.utility.Utility;

public class Power {

	public static void main(String[] args) {
		System.out.println("enter value of n");//to find 2 power of number
		try {
		int n=Utility.readInt();
		int i=0;
		while(i<=n)
		{
			System.out.println("2 power "+i+" is "+Utility.powerValue(2,i));
			i++;
		}
		}
		catch (Exception e) {
			System.out.println("enter valid input");
		}
		
		// TODO Auto-generated method stub

	}

}
