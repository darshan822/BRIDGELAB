package com.bridgelabz.jiunittest;

import com.bridgelabz.utility.Utility;

public class BinaryResultant {

	public static void main(String[] args) {
		System.out.println("enter the value in decimail");
		int n=Utility.readInt();
		String s=Integer.toBinaryString(n);
		System.out.println("after binary conversion value is "+s);
		System.out.println("the new value is "+Utility.swapNibbles(n));
		if(Utility.isPowerOfTwo(Utility.swapNibbles(n)))
			System.out.println("the resultant number is power of 2");
		else
			System.out.println("resultant number is not a power of 2");
		// TODO Auto-generated method stub

	}

}
