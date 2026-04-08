package com.venkat.stack;

public class Stack {
	public int[] arr;
	public int topOfStack;

	public Stack(int size) {
		arr = new int[size];
		topOfStack = -1;
	}

	public boolean isEmpty() {
		if (topOfStack == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		return topOfStack == (arr.length - 1);
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("The Stack is full so we cannot insert this element : " + value);
			return;
		}
		arr[topOfStack + 1] = value;
		topOfStack++;
		System.out.println("The Value is successfully inserted");
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		} else {
			int topValue = arr[topOfStack];
			topOfStack--;
			return topValue;
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("The Stack is Empty can not find the TOP value");
			return -1;
		} else {
			return arr[topOfStack];
		}
	}

	public void delete() {
		arr = null;
		System.out.println("The stack is succesfully deleted");
	}
}
