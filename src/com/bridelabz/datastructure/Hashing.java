package com.bridelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.bridgelabz.utility.Base;

public class Hashing {
	
	public static void main(String[] args) throws Exception {
		Base b = new Base();
		System.out.println("Enter the size");
		int size = b.inputInteger();
		HashChaining linkedHash = new HashChaining(size);
		File file = new File("HashInput");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String readFileStore = "";
		String readFile;
		while ((readFile = bufferedReader.readLine()) != null) {
			readFileStore = readFileStore + readFile +" ";
		}
		bufferedReader.close();
		for (String fileString : readFileStore.split("\\s", 0)) {
			int number = Integer.parseInt(fileString);
			linkedHash.insert(number);
		}
		System.out.println("Find the number to be searched");
		int value = b.inputInteger();
		linkedHash.search(value);
		linkedHash.display();
		linkedHash.write();
	}
}