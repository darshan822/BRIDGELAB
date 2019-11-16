package com.bridgelabz.jiunittest;

import com.bridgelabz.utility.Utility;

public class MonthPayment {

	public static void main(String[] args) {
		double p=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double r=Double.parseDouble(args[2]);
		Utility.calculatePayment(p,y,r);

		// TODO Auto-generated method stub

	}

}
