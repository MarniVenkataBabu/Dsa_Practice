package com.venkat.arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int [] array = new int[]{3,0,2};
		System.out.println(missingNumber(array));
		
	}
	public static int missingNumber(int [] array) {
		int n = array.length;
		int actualSum = 0;
		int expectedSum = (n*(n+1))/2;
		for(int element : array) {
			actualSum += element;
		}
		return expectedSum - actualSum;
	}
}
