package com.bridgelabz.logical;

import com.bridgelabz.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		System.out.println("enter 1 to start stop watch");
		int value=Utility.readInt();
		if(value==1)
			Utility.startStopWatch();
		System.out.println("enter 2 to stop watch");
		while(true)
		{
			int n=Utility.readInt();
			if(n==2)
				break;
			
		}
		System.out.println("elapsed time is "+Utility.elapsedTime()+" seconds");
}

}
