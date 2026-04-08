package com.venkat.queue;

public class Queue {
	
	public int []arr;
	public int beginingOfQueue;
	public int topOfQueue;
	
	public Queue(int value) {
		arr = new int[value];
		topOfQueue = -1;
		beginingOfQueue = -1;
	}
	//isEmpty
	public boolean isEmpty() {
		if(topOfQueue == -1) {
			System.out.println("The Queue is Empty");
			return true;
		}else {
			return false;
		}
		
	}
	
	//isFull
	public boolean isFull() {
		if(topOfQueue == arr.length -1) {
			System.out.println("The Queue is Full");
			return true;
		}
		return false;

	}
	//Enqueue
	public void enqueue(int value) {
		if(isFull()) {
			System.out.println("The queue is full unable to insert the value "+ value);
		}else {
			arr[topOfQueue+1] = value;
			beginingOfQueue = 0;
			topOfQueue++;
		}
		
	}
	
	//DeQueue
	
	
	//Delete
	
	
}
