package com.venkat.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	BinaryNode root;
	
	public BinaryTree() {
		root = null;
	}
	
	//insert method
	private BinaryNode insert(BinaryNode currentNode , int value) {
		if(currentNode == null) {
			BinaryNode newNode = new BinaryNode();
			newNode.value = value;
			return newNode;
		} else if(value <= currentNode.value) {
			currentNode.left = insert(currentNode.left, value);
			return currentNode;
		} else {
			currentNode.right = insert(currentNode.right,value);
			return currentNode;
		}
	}
	
	public void insert(int value) {
		insert(root,value);
	}
	
	//preOrder Traversal  Root--> left--> right
	public void preOrder(BinaryNode node) {
		if(node== null) {
			return;
		}else {
			System.out.print(node.value+" ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	//inorder traversal Left --> Root ---> Right
	public void inOrder(BinaryNode node) {
		if(node == null) {
			return;
		}else {
			inOrder(node.left);
			System.out.print(node.value+" ");
			inOrder(node.right);
		}
	}
	
	//post order
	public void postOrder(BinaryNode node) {
		if(node == null) {
			return;
		}else {
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.value+" ");
		}
	}
	
	//level order traversal
	public void levelOrder(BinaryNode node) {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if(presentNode.left != null) {
				queue.add(presentNode.left);
			} if(presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
	}
	
	//search for a node
	public BinaryNode search(BinaryNode node, int value) {
		if(node == null) {
			System.out.println("The tree is empty");
			return null;
		} else if(node.value == value) {
			System.out.println("The value "+value+" is Found in the tree");
			return node;
		} else if(value < node.value) {
			return search(node.left, value);
		} else {
			return search(node.right, value);
		}
	}
	
	//Get the Minimum node
	public BinaryNode minimumNode(BinaryNode root) {
		if(root.left == null) {
			return root;
		}else {
			
			return minimumNode(root.left);
			
		}
	}
	
	//delete a particular node in the Binary tree
	public BinaryNode deleteNode(BinaryNode root, int value) {
		if(root == null) {
			System.out.println("No Node found to delete");
			return null;
		} else if(value < root.value) {
			root.left = deleteNode(root.left, value);
		} else if(value > root.value) {
			root.right = deleteNode(root.right, value);
		} else {
			if(root.left != null && root.right != null) {
				BinaryNode temp = root;
				BinaryNode minNodeForRight = minimumNode(temp.right);
				root.value = minNodeForRight.value;
				root.right = deleteNode(root.right,minNodeForRight.value);
			}
			else if(root.left != null ) {
				root = root.left;
			} else if (root.right != null) {
				root = root.right;
			}else {
				root = null;
			}
		}
		return root;
	}
	
	//delete Entire BST
	public void deleteBST() {
		root = null;
		System.out.println("The BST is deleted successfully");
	}
	
}
