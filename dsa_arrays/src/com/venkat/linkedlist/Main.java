package com.venkat.linkedlist;

public class Main {
	public static void main(String[] args) {
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		csll.createCSLL(10);
		csll.insertIntoCSLL(20, 1);
		csll.insertIntoCSLL(30, 2);
		csll.traverSL();
		System.out.println(csll.head.value);
		csll.insertIntoCSLL(5, 0);
		System.out.println(csll.head.value);
		csll.traverSL();
		csll.search(5);
		csll.search(10);
		csll.search(20);
		csll.search(30);
	}
}
