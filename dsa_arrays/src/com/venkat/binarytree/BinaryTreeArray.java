package com.venkat.binarytree;

public class BinaryTreeArray {
	private int [] arr;
	private int lastUsedIndex;
	
	public BinaryTreeArray(int size) {
		arr = new int [size];
	}
	
	//pre Order
	public void preOrder(int index) {
		if(index > lastUsedIndex) {
			return;
		} else {
			System.out.println(arr[index]+ " ");
			preOrder(2 * index);
			preOrder(2 * index + 1);
		}
	}
	//in Order
	public void inOrder(int index) {
		if(index> lastUsedIndex) {
			return;
		}else {
			inOrder(2 * index);
			System.out.println(arr[index]+ " ");
			inOrder(2 * index + 1);
		}
	}
	
	//post Order
	public void postOrder(int index) {
		if(index > lastUsedIndex) {
			return;
		}else {
			postOrder(2 * index);
			postOrder(2 * index + 1);
			System.out.println(arr[index]+ " ");
		}
	}
	//level Order
	
	//insert
	
	//search 
	
	//delete a node in tree
	
	//delete entire tree
	

}
