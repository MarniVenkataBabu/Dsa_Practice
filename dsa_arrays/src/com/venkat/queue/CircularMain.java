package com.venkat.queue;

public class CircularMain {
	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);
		System.out.println(cq.isEmpty());
		System.out.println(cq.isFull());
		cq.enQueue(9);
		cq.enQueue(3);
		cq.enQueue(4);
		cq.enQueue(1);
		cq.enQueue(7);
		cq.enQueue(8);
	}
}
