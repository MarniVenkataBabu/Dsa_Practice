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
				System.out.println("Unable to insert the value : "+value);
			}else {
				if(beginningOfQueue != 0 && topoFQueue+1 == size) {
					topoFQueue =0;
					arr[topoFQueue] = value;
				}
				beginningOfQueue = 0;
				topoFQueue++;
				arr[topoFQueue] = value;
			}
		}
		
	//dequeue
		
	//peek
		
	//delete
		
	
}
