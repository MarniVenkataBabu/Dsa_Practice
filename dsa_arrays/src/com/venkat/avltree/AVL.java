package com.venkat.avltree;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
	//Constructor
	BinaryNode root;
	
	public AVL() {
		root = null;
		
	}
	
	//preOrder 
	public void preOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		System.out.println(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	//inOrder
	public void inOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.println(node.value+ " ");
		inOrder(node.right);
	}
	
	//postOrder
	public void postOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.value  + " ");
	}
	
	//levelOrder
	public void levelOrder(BinaryNode node) {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.println(presentNode.value + " ");
			if(presentNode.left != null) {
				queue.add(presentNode.left);
			} if(presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
		
	}
	
	//searchElement
	
	//insert
	
	//deleteNode
	
	//delete Entire Tree
	
}
