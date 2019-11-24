package com.bridelabz.datastructure;

import com.bridgelabz.utility.Base;

public class UnOrderedList {
	public static void main(String[] args) throws Exception {
		
		Base b = new Base();
		System.out.println("Enter the word to be searched");
		String userInput = b.inputString();
		b.unOrderedList(userInput);
	}
}