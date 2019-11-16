package com.bridgelabz.functional;
import java.io.*;
import com.bridgelabz.utility.Utility;
public class Twodimensionalarrray {

	public static void main(String[] args) {
		System.out.println("enter value of row");
		int row=Utility.readInt();
		System.out.println("enter value of col");
		int col=Utility.readInt();
		int[][] mat=Utility.readTwoDimensionalArray(row,col);
		Utility.displayMatrix(mat);
		// TODO Auto-generated method stub

	}

}
