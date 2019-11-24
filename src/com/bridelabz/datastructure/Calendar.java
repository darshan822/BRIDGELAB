package com.bridelabz.datastructure;

import com.bridgelabz.utility.Base;

public class Calendar {
	public static void main(String[] args) {
		Base b = new Base();
		System.out.println("Enter month and year");
		int month = b.inputInteger();
		int year = b.inputInteger();
		Base.calender(month,year);
	}
}