package com.venkat.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class SecondLargestNum {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,4,2,4,2,3,5,6,5,8,7,9,1,8);
	int secondLargest = list.stream()
										.distinct()
										.sorted(Comparator.reverseOrder())
										.skip(1)
										.findFirst()
										.orElseThrow(() -> new RuntimeException("Not Enough Elements"));
	System.out.println(secondLargest);

	}

}
