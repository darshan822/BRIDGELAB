package com.bridgelabz.jiunittest;

import com.bridgelabz.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		int[] notes = new int[]{1,2,5,10,50,100,500,1000};
        int[] noteCounter = new int[notes.length];
        int amount = Integer.parseInt(args[0]);
        System.out.println("min num of notes are ");
        Utility.calculateNotes(notes,noteCounter,amount,noteCounter.length-1); 
		// TODO Auto-generated method stub

	}

}
