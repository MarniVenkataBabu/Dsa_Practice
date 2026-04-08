package com.venkat.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class MaxMinNum {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,4,6,77,88,33,152);
		IntSummaryStatistics stats = list
				.stream()
				.mapToInt(Integer::intValue).summaryStatistics();
		System.out.println("Max: "+stats.getMax());
		System.out.println("Min: "+stats.getMin());
		System.out.println("Average"+ stats.getAverage());
		System.out.println("count "+stats.getCount());

	}
}
