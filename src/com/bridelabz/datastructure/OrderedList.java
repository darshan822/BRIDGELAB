package com.bridelabz.datastructure;

import com.bridgelabz.utility.Base;


public class OrderedList {
	public static void main(String[] args) throws Exception {
		Base b = new Base();
		System.out.println("Enter the number to be searched");
		String searchItem  = b.inputString();
		Base.orderedList(searchItem);
	}
}