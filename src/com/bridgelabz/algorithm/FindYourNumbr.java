package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class FindYourNumbr {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int number = Utility.readInt();
		int numberPower = Utility.powerValue(number, 2);
		int[] array = new int[numberPower];
		for(int i=0;i<numberPower;i++) {
			array[i]=i;
		}
		Utility.binarySearchOutputBound(array);
		// TODO Auto-generated method stub

	}

}
