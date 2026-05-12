package com.venkat.hashing;

public class Main {
	public static void main(String[] args) {
		DirectChaining directChaining = new DirectChaining(13);
		directChaining.insertHashKey("The");
		directChaining.insertHashKey("quick");
		directChaining.insertHashKey("brown");
		directChaining.insertHashKey("fox");
		directChaining.insertHashKey("over");
		directChaining.displayHashTable();
		directChaining.search("over");
		directChaining.deletehashValue("ox");
		directChaining.displayHashTable();
	}
}
