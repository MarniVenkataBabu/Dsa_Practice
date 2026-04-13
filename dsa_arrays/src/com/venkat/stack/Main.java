package com.venkat.stack;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("hello world");
		Stack stack = new Stack(4);
		stack.push(1);
		int topValue = stack.peek();
		System.out.println(topValue);
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		
		stack.push(4);
		int topValue2 = stack.peek();
		System.out.println(topValue2);
		System.out.println(stack.pop());
		int topValue3 = stack.peek();
		System.out.println(topValue3);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		
		
		StackLinkedList stackLinkedList = new StackLinkedList();
		stackLinkedList.push(1);
		stackLinkedList.push(4);
		stackLinkedList.push(5);
		stackLinkedList.push(6);
		stackLinkedList.pop();
		stackLinkedList.peek();
		stackLinkedList.linkedlist.traverseSinglyLinkedList();
		
	}
}
