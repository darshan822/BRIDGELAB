package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Insertionsort {

	public static void main(String[] args) {
		System.out.println("enter size of array");
		int n=Utility.readInt();
		System.out.println(n);
		String[] st=new String[n];
		Utility.readStringArray(st);;
		st=Utility.insertionSort(st,n);
		System.out.println("sorting element");
		Utility.printStringArray(st);
		// TODO Auto-generated method stub

	}

}
