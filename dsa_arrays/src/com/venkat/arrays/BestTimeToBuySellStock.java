package com.venkat.arrays;
public class BestTimeToBuySellStock{
	public static void main(String[] args) {
		int [] array = new int[] {7,6,4,3,1};
		System.out.println(bestTime(array));
	}
	public static int bestTime(int [] array) {
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE; 
		for(int element : array) {
			if(element < minPrice) { 
				minPrice = element;  
			}else if(element - minPrice > maxProfit) {
				maxProfit = element - minPrice;
			}
		}
		return maxProfit;
	}
}