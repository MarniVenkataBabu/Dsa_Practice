package com.venkat.arrays;

import java.util.HashSet;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int [] arr = new int[] {1,1,2};
		System.out.println(hasDuplicate(arr));
	}
	public static boolean hasDuplicate(int [] array) {
		HashSet<Integer> set = new HashSet<>();
		for(int element : array) {
			if(set.contains(element)) {
				return true;
			}
			set.add(element);
		}
		return false;
	}
}
