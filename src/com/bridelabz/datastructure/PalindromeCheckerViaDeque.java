package com.bridelabz.datastructure;

import com.bridgelabz.utility.Base;


public class PalindromeCheckerViaDeque {
	public static void main(String[] args) {
		Base b = new Base();
		System.out.println("Enter the word to check palindrome");
		String word = b.inputString();
		boolean b1 = Base.palindromeChecker(word);
		if(b1)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}