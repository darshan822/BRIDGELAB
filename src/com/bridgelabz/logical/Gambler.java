package com.bridgelabz.logical;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		    int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
	        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
	        int trials = Integer.parseInt(args[2]);    // number of trials to perform
	        Utility.gambling(stake,goal,trials);

		// TODO Auto-generated method stub

	}

}
