package com.venkat.recursion;

public class DecToBin {
	public static void main(String[] args) {
		DecToBin d = new DecToBin();
		System.out.println(d.decimalToBinary(10));
	}
	/*
	 * //Step 1 : Recursive case the flow
	 * 
	 *   Divide the number by 2 
	 *   Get the integer quotient for the next iteration
	 *   Get the remainder for the binary digit
	 *   Repeat the steps until the quotient is equal to 0
	 */
	public int decimalToBinary(int n) {
		if(n==0) {
			return 0;
		}
		return n%2 + 10*decimalToBinary(n/2);
	}
}
