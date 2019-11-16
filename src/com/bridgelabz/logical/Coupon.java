package com.bridgelabz.logical;

import com.bridgelabz.utility.Utility;

public class Coupon {

	public static void main(String[] args) {
		System.out.println("enter value of N");
		int n=Utility.readInt();
		System.out.println("total random number to genarate n distinct coupon is "+Utility.collect(n));//method; to generate coupon

	}

}
