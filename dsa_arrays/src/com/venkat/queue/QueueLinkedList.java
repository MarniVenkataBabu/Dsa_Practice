package com.venkat.queue;

public class QueueLinkedList {
	LinkedList linkedList;

	public QueueLinkedList(int value) {
		linkedList = new LinkedList();
		linkedList.createSinglyLinkedList(value);
	}

	// isEmpty
	public boolean isEmpty() {
		if (linkedList.head == null) {
			return true;
		} else {
			return false;
		}
	}

	// enqueue
	public void enqueue(int value) {
		linkedList.insertInLinkedList(value, linkedList.size);
	}

	// deQueue
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Unable to delete the queue it is empty");
			return -1;

		} else {
			int front = linkedList.head.value;
			linkedList.deletionOfNode(0);
			return front;
		}
	}

	// peek
	public int peek() {
		if(isEmpty()) {
			System.out.println("The Queue is Empty");
			return -1;
		}else {
		return linkedList.head.value;
		}
	}

	// delete
	public void delete() {
		linkedList.head = null;
		linkedList.tail = null;
		linkedList = null;
	}
}
