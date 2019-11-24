package com.bridelabz.datastructure;

import com.bridgelabz.utility.Base;


public class PrimeAnagram2DArray {
	public static void main(String[] args) {
		int size = 1000;
		int primeCount=1;
		int count=0;
		 while(primeCount<=size) {
			if(Base.prime(primeCount)) {
				count++;
			}
			primeCount++;
		}
		 System.out.println();
		 System.out.println("Anagram");
		 int[] prime= new int[count];
		 primeCount=1;
		 int loop=0;
		 while(primeCount<=size) {
			 if(Base.prime(primeCount)) {
				 prime[loop]=primeCount;
				 loop++;
			 }
			 primeCount++;
		 }
		Base.primeAnagram2DArray(prime);
	}
}