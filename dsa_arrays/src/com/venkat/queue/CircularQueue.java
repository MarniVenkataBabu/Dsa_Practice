package com.venkat.queue;

public class CircularQueue {

	public int[] arr;
	public int beginningOfQueue;
	public int topoFQueue;
	public int size;
	
	public CircularQueue(int size) {
		arr = new int [size];
		this.size = size;
		beginningOfQueue = -1;
		topoFQueue = -1 ;
	}
	
	//isEmpty
	
	public boolean isEmpty() {
		if(topoFQueue == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	//isFull
	public boolean isFull() {
		if(beginningOfQueue == 0 && topoFQueue+1 == size) {
			return true;
		}else if (topoFQueue+1 == beginningOfQueue) {
			return true;
			
		}else {
			return false;
		}
	}
	//enqueue
	public void enQueue(int value) {
			if(isFull()) {
				System.out.println("CQ is full Unable to insert the value : "+value);
			}else if(isEmpty()){
				beginningOfQueue = 0;
				topoFQueue++;
				arr[topoFQueue] = value;
			}else {
				if(topoFQueue+1 == size) {
					topoFQueue = 0;
				}else {
					topoFQueue++;
				}
				arr[topoFQueue] = value;
			}
		}
		
	//dequeue
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("the Queue is Empty");
			return -1;
		}else {
			int result = arr[beginningOfQueue];
			arr[beginningOfQueue] = Integer.MIN_VALUE;
			if(beginningOfQueue == topoFQueue) {
				beginningOfQueue =  topoFQueue= -1;
			} else if(beginningOfQueue+1 == size) {
				beginningOfQueue = 0;
			}else {
				beginningOfQueue++;
			}
			return result;
		}
	}
		
	//peek
	public int peek() {
		if(isEmpty()) {
			System.out.println("No First element Queue is Empty");
			return -1;
		}else {
			return arr[beginningOfQueue];
		} 
	}
	//delete
	public void delete() {
		arr = null;
	}
		
	
}
