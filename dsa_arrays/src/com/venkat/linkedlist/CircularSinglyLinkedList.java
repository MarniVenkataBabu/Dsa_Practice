package com.venkat.linkedlist;

public class CircularSinglyLinkedList {
	
	public Node head;
	public Node tail;
	public int size;
	
	//create Circular Sinly LinkedList 
	public Node createCSLL(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		node.next = node;
		head = node;
		tail = node;
		size = 1;
		return head;
	}
	
	//insert 
	public void insertIntoCSLL(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		if(head == null) {
			createCSLL(nodeValue);
			return;
		} else if(location == 0) {
			node.next = head;
			head = node;
			tail.next = head;
				
		}else if(location >= size){
			tail.next = node;
			tail = node;
			tail.next = head;
		} else {
			Node tempNode = head;
			for(int i = 0; i< location -1; i++) {
				tempNode = tempNode.next;
			}
			node.next = tempNode.next;
			tempNode.next = node;
		}
		size++;
	}
	
	//traversal
	public void traverSL() {
		if(head != null) {
			Node node = head;
			for(int i =0; i<size; i++) {
				System.out.print(node.value);
				if(i != size-1) {
					System.out.print("->");
				}
				node = node.next;
			}
			System.out.print("\n");
		}else {
			System.out.println("No CSLL exists!");
		}
		
	}
	
	//search
	public void search(int nodeValue) {
		Node tempNode = head;
		for(int i = 0; i<size; i++) {
			if(tempNode.value == nodeValue) {
				System.out.println("node found at "+ i);
			}
			tempNode = tempNode.next;
		}
		
	}
	
	//Delete
	public void deleteNode(int location) {
		
		if(head == null) {
			System.out.println("No LinkedList Available to delete");
			return;
		} else if(location ==0) {
			head = head.next;
			tail.next = head;
			size--;
			if(size == 0) {
				tail = null;
				head.next = null;
				head = null;
			}
		} else if(location >= size) {
			Node tempNode = head;
			for(int i =0; i<size-1; i++){
				tempNode = tempNode.next;
			}
			if(tempNode == head) {
				head.next = null;
				tail = head = null;
				size--;
				return;
			}
			tempNode.next = head;
			tail = tempNode;
			size--;
		} else {
			Node tempNode = head;
			int index =0;
			while(index < location  -1) {
				tempNode = tempNode.next;
				index++;
			}
			tempNode.next = tempNode.next.next;
			size--;
		}
	}
	
	//Delete Entire CSLL
	public void deleteCSLL() {
		if(head == null) {
			System.out.println("No CSLL exists!");
		}else {
			head = null;
			tail.next=null;
			tail = null;
			System.out.println("The CSLL has been deleted!");
		}
	}
}
