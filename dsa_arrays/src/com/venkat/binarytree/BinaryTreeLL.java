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
	
	//search of an element
	public void search(String value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if(presentNode.value == value) {
				System.out.println("The Value-" + value +" is Found in Tree");
				return;
			}else {
				if(presentNode.left != null) {
					queue.add(presentNode.left);
				}
				if(presentNode.right != null) {
					queue.add(presentNode.right);
				}
			}
			
			
		}
		System.out.println("No Node with value "+value+"Found in the Tree");
	}
	

	
	//insert Method in BinaryTree
	public void insert(String value) {
		BinaryNode newNode = new BinaryNode();
		newNode.value = value;
		if(root == null) {
			root = newNode;
			return;
		} 
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		BinaryNode presentNode = null;
		while(!queue.isEmpty()) {
			presentNode = queue.remove();
			if(presentNode.left == null) {
				presentNode.left = newNode;
				break;
			} else if(presentNode.right == null) {
				presentNode.right = newNode;
				break;
			} else {
				queue.add(presentNode.left);
				queue.add(presentNode.right);
			}
			
		}
		
	}
	
	//Get the Deepest Route of the Node
	public BinaryNode getDeepestNode() {
		if(root == null) {
			System.out.println("");
			return null;
		}
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		BinaryNode presentNode = null;
		while(!queue.isEmpty()) {
			presentNode = queue.remove();
			if(presentNode.left != null) {
				queue.add(presentNode.left);
				
			}
			if(presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
		
		return presentNode;
	}
	
	//Delete the Deepest Node of the Tree
	public void deleteDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		BinaryNode previousNode , presentNode = null;
		while(!queue.isEmpty()) {
			previousNode = presentNode;
			presentNode = queue.remove();
			if(presentNode.left == null) {
				previousNode.right = null;
			} else if(presentNode.right == null) {
				presentNode.left = null;
			} else {
				if(presentNode.left != null) queue.add(presentNode.left);
				if(presentNode.right != null) queue.add(presentNode.right);
			}
		}
		
	}
	
	//Delete the given Node
	public void removeNode(String value) {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if(presentNode.value == value) {
				presentNode.value = getDeepestNode().value;
				deleteDeepestNode();
				return;
			} else {
				if(presentNode.left != null) queue.add(presentNode.left);
				if(presentNode.right != null) queue.add(presentNode.right);
			}
		}
	}
	
	//Delete Entire Tree
	public void deleteTree() {
		root = null;
		System.out.println("The tree is deleted successfully");
	}
}
