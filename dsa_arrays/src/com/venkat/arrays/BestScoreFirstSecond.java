package com.venkat.arrays;

import java.util.Arrays;

public class BestScoreFirstSecond {
 public static void main(String[] args) {
	int [] arr = new int [] {20,19,16,90};
	System.out.println(Arrays.toString(bestScore(arr)));
}
 public static int[] bestScore(int [] arr) {
	 int firstHighest = 0;
	 int secondHighest = 0;
	 for(int element : arr) {
		 if(element > firstHighest) {
			 secondHighest = firstHighest;
			 firstHighest = element;
		 }else if(element < firstHighest && element > secondHighest) {
			 secondHighest = element;
		 }
	 }
	 return new int []{firstHighest, secondHighest};
 }
}
