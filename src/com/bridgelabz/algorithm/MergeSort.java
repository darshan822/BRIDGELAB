package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("enter size of array");
		int n=Utility.readInt();
		int[] arr=new int[n];
		arr=Utility.readArray(n);
		System.out.println("Given Array"); 
        Utility.printArray(arr); 
        Utility.sort(arr, 0, arr.length-1); 
        System.out.println("\nSorted array"); 
        Utility.printArray(arr);
		// TODO Auto-generated method stub

	}

}
