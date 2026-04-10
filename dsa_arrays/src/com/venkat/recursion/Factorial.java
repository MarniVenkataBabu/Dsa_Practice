package com.venkat.recursion;

public class Factorial {
	
	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println(fact.factorial(6));
	}
	public int factorial(int n) {
		if(n<1) {
			return -1;
		}
		if(n == 1) {
			return 1;
		}
		return n * factorial(n-1);
	}

}
