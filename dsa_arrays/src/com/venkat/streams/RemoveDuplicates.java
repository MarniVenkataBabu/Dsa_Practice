package com.venkat.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> arrayNum = Arrays.asList(1,2,3,4,5,2,3);
		List<Integer> distinct = arrayNum.stream().distinct().collect(Collectors.toList());
		System.out.println("removed duplicates "+ distinct);
	}

}
