package com.venkat.streams;

public class ReverseString {

	public static void main(String[] args) {
		String str = "venkat";
		System.out.println(reverse(str));
	}
	
	public static String reverse(String input) {
		char [] chars = input.toCharArray();
		StringBuilder str = new StringBuilder();
		for(int i = chars.length -1; i>=0; i--) {
			str.append(chars[i]);
		}
		return str.toString();
	}

}
