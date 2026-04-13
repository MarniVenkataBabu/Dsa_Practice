package com.venkat.stack;

public class StackLinkedList {

	LinkedList linkedlist;

	public StackLinkedList() {
		linkedlist = new LinkedList();
	}

	// is Empty
	public boolean isEmpty() {
		if (linkedlist.head == null) {
			System.out.println("The stack is empty");
			return true;
		} else {
			return false;
		}
	}

	// push
	public void push(int value) {
		if(isEmpty()) {
			linkedlist.createSinglyLinkedList(value);
		}else {
			linkedlist.insertInLinkedList(value, 0);
		}
	}

	// pop
	public int pop() {
		if(isEmpty()) {
			System.out.println("The Linked list is empty");
			return -1;
		}else {
			Node head = linkedlist.head;
			linkedlist.deletionOfNode(0);
			return head.value;
		}
	}

	// peek
	public int peek() {
		System.out.println("The peek value is : "+ linkedlist.head.value);
		return linkedlist.head.value;
	}
	// delete
	public void delete() {
		linkedlist.head = null;
		System.out.println("The stack is deleted successfully");
	}

}
