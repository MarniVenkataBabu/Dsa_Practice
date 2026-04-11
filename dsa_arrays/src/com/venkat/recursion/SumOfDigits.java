package com.venkat.recursion;

public class SumOfDigits {
	public static void main(String[] args) {
		SumOfDigits s = new SumOfDigits();
		System.out.println(s.sumOfDigits(111));
	}
	public int sumOfDigits(int n) {
		if(n<0) {
			return 0;
		}
		if(n == 0 ) {
			return 0;
		}
		return n%10 + sumOfDigits(n/10);
	}
}
