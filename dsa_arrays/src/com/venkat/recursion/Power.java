package com.venkat.recursion;

public class Power {
	public static void main(String[] args) {
		Power p = new Power();
		System.out.println(p.powerOfNum(2, 3));
	}
	public int powerOfNum(int number, int power) {
		if(power < 0) {
			return -1;
		}
		if(power == 0) {
			return 1;
		}
		return number * powerOfNum(number, power-1);
	}
}
