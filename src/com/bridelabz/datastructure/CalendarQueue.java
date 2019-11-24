package com.bridelabz.datastructure;

import com.bridgelabz.utility.Base;

public class CalendarQueue {
	public static void main(String[] args) {
		Base b = new Base();
		System.out.println("Enter the month and year");
		int month = b.inputInteger();
		int year = b.inputInteger();
		int[][] calender = Base.calenderQueue(month,year);
		String[] days = {"S","M","T","W","T","F","S"};
		for(int i=0;i<days.length;i++)
			System.out.print(days[i]+"  ");
		System.out.println();
		LinkedQueue<Integer> list[] = new LinkedQueue[6];
		for(int i=0;i<6;i++) {
			list[i]=new LinkedQueue();
		}
		for(int i=0;i<6;i++) {
			
			for(int j=0;j<7;j++) {
				
				list[i].add(calender[i][j]);
			}
		}
		for(int i=0;i<6;i++)
			list[i].display();
		
		
	}
}
