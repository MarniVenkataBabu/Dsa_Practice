package com.venkat.recursion;

public class FindMaxNum {
	public static void main(String[] args) {
		int [] arr = new int [] {11, 4, 12, 7};
		
		FindMaxNum f = new FindMaxNum();
		System.out.println(f.findMaxNumofArray(arr,arr.length));
	}

	public int findMaxNumofArray(int[] sampleArray, int n) {
		if(n == 1) {
			return sampleArray[0];
		}
		return Math.max(sampleArray[n-1],findMaxNumofArray(sampleArray, n-1));
	}
}
