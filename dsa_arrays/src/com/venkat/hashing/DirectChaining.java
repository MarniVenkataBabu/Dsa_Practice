package com.venkat.hashing;

import java.util.Iterator;
import java.util.LinkedList;

public class DirectChaining {
	LinkedList<String> [] hashTable;
	int maxChainSize = 5;
	
	public DirectChaining(int size ) {
		hashTable = new LinkedList[size];
	}
	// hash function
	public int modASCIIhashFunction(String word, int M) {
		char ch[];
		ch = word.toCharArray();
		int i, sum;
		for (sum = 0, i = 0 ;  i< word.length(); i++) {
			sum = sum  + ch[i];
			
		}
		return sum % M;
	}
	// insert into hash table
	public void insertHashKey(String word) {
		int newIndex = modASCIIhashFunction(word, hashTable.length);
		if(hashTable[newIndex] == null) {
			hashTable[newIndex] = new LinkedList<String>();
			hashTable[newIndex].add(word);
		}else {
			hashTable[newIndex].add(word);
		}
	}
	
	//displayHashTable
	public void displayHashTable() {
		if (hashTable == null) {
			System.out.println("\nHashTable doesnot exists");
		}else {
			System.out.println("\n-----------HashTable----------");
			for(int i = 0; i< hashTable.length; i++) {
				System.out.println("Index : "+i+" value :"+hashTable[i]);
			}
		}
	}
	
	//Search
	public boolean search(String word) {
		int newIndex = modASCIIhashFunction(word, hashTable.length);
		if(hashTable[newIndex] != null && hashTable[newIndex].contains(word)) {
			System.out.println("\n "+word+" Found in the hashTable in index : "+ newIndex);
			return true;
		}else {
		return false;
		}
	}
	
	//Delete
	public void deletehashValue(String word) {
		int newIndex = modASCIIhashFunction(word, hashTable.length);
		boolean result = search(word);
		if(result == true) {
			hashTable[newIndex].remove(word);
			System.out.println(word +" is Deleted from Hash Table");
		}else {
			System.out.println("No value exists in the HashTable");
		}
	}
}
