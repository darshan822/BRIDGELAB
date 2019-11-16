package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Cubicrunning {

	public static void main(String[] args) {
		System.out.println("enter size of array");
	    int n=Utility.readInt();
	   int[] a= Utility.readArray(n);
	   System.out.println(" number of triple is "+Utility.findTriplets(a, n));
	    
	   
		// TODO Auto-generated method stub

	}

}
