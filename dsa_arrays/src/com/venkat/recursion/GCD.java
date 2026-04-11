package com.venkat.recursion;

public class GCD {
	public static void main(String[] args) {
		GCD gcd = new GCD();
		System.out.println(gcd.gcdOfTwonum(12, 8));
	}
	public int gcdOfTwonum(int a ,int b) {
		if( b == 0) {
			return a;
		}
		return gcdOfTwonum(b, a % b);
	}
}
 