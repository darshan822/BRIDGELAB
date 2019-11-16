package com.bridgelabz.jiunittest;
import com.bridgelabz.utility.Utility;

public class Calender {

	public static void main(String[] args) {
		System.out.println("enter date");
		int d=Utility.readInt();
		System.out.println("enter month");
		int m=Utility.readInt();
		System.out.println("enter year");
		int y=Utility.readInt();
		System.out.println(Utility.dayOfWeek(d,m,y));//calculate day interms of number
		
		
		// TODO Auto-generated method stub

	}

}
