package com.venkat.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
	BinaryNode root;
	
	public BinaryTreeLL() {
		this.root = null;
	}
	
	//preOrder Traversal
	public void preOrder(BinaryNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.value +" ");
		preOrder(root.left);
		preOrder(root.right);
	}

	//inOrder Traversal
	public void inOrder(BinaryNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.value + " ");
		inOrder(root.right);
	}
	
	//postOrder traversal
	public void postOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value+" ");
		
	}
	
	//levelOrder Traversal
	public void levelOrder() {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.print(presentNode.value+ " ");
			if(presentNode.left != null) {
				queue.add(presentNode.left);
			}
			if(presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
	}
}
