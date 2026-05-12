package com.venkat.hashing;

public class LinearProbing {
	
	String[] hashTable;
	int cellUsedNumber;
	
	public LinearProbing(int size) {
		hashTable = new String[size];
		cellUsedNumber = 0;
	}
	
}
