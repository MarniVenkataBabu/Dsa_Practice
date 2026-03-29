package com.venkat.linkedlist;

public class SingleLinkedList {
	public Node head;
	public Node tail;
	public int size;
	
	// create single linked list
	public Node CreateSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		size =1;
		return head;
	}
}
