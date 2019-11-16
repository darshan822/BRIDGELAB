package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);//read command line arguments
        double v = Double.parseDouble(args[1]);
        Utility.windChillCalculate(t,v);
     
		// TODO Auto-generated method stub

	}

}
