package com.venkat.hashing;

import java.util.Iterator;

public class LinearProbing {
	String [] hashTable;
	int usedCellNumber;
	
	public LinearProbing(int size) {
		hashTable = new String[size];
		usedCellNumber = 0;
	}
	//hashFunction
	public int modAsciiHashFunction(String word, int M) {
		char [] ch;
		ch = word.toCharArray();
		int sum, i;
		for (sum=0,i = 0; i < word.length(); i++) {
			sum = sum + ch[i];
		}
		return sum % M;
	}
	//loadFactor
	public double getLoadFactor() {
		double loadFactor = usedCellNumber * 1.0/hashTable.length;
		return loadFactor;
	}
	
	//rehash
}
