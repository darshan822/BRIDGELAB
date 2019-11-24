package com.bridelabz.datastructure;

import com.bridgelabz.utility.Base;


public class BankCashCounter {
	public static void main(String[] args) {
		Base b = new Base();
		System.out.println("Enter total number of people");
		int numberOfPeople = b.inputInteger();
		int cashBalance = b.bankCashCounter(numberOfPeople);
		System.out.println("Cash Balance : "+cashBalance);
	}
}