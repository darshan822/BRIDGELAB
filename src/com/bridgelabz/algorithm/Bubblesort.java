package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Bubblesort {

	public static void main(String[] args) {
		System.out.println("enter size of array");
		int n=Utility.readInt();
		int[]a=new int[n];
		a=Utility.readArray(n);
		a=Utility.bubbleSort(a);
		System.out.println("after sort");
		Utility.printArray(a);
		// TODO Auto-generated method stub

	}

}
