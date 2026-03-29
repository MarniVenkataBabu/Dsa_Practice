package com.venkat.linkedlist;

public class Main {
	public static void main(String[] args) {
		SingleLinkedList sl = new SingleLinkedList();
		sl.CreateSinglyLinkedList(5);
		System.out.println(sl.head.value);
		System.out.println(sl.tail.value);
		System.out.println(sl.head.next);
	}
}
