package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Prime {

	public static void main(String[] args) {//to check prime num anagram or not program
		System.out.println("prime number between 0 to 1000");
		for(int i=2;i<=1000;i++)
		{
			if(Utility.checkPrimeRec(i,i-1))
			{

				System.out.println(i+" is prime number ");
				if(Utility.rev(i))
					System.out.println(i+" is palindrome");	
				String s1=Integer.toString(i);
				s1=Utility.bubbleSortString(s1);
				for(int j=2;j<=9999;j++)
				{
					String s2=Integer.toString(j);
					s2=Utility.bubbleSortString(s2);
					if(Utility.compare(s1,s2)&&(i!=j||i<10))
					{
						System.out.println(i+" is angram of  "+j);
					}
				}
			}
				
			}
			}
			
		}
		// TODO Auto-generated method stub




