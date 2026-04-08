package com.venkat.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
	public static void main(String[] args) {
		String input = "java phyton C++";
		String result = Arrays.stream(input.split(" "))
				.map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		
		System.out.print(result);
		
	}
}
