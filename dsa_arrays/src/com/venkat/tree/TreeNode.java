package com.venkat.tree;
import java.util.ArrayList;


public class TreeNode {
	public String data;
	ArrayList<TreeNode> children;
	
	public TreeNode(String data) {
		this.data = data;
		this.children = new ArrayList<TreeNode>();
	}
	
	public void addChild(TreeNode node) {
		this.children.add(node);
	}
	/*
	 * 
	 * print(A, 0)
		 ├── print(B, 1)
		 │    ├── print(D, 2)
		 │    └── print(E, 2)
		 └── print(C, 1)
		      └── print(F, 2)
	 */
	public String print(int level) {
		String ret;
		ret = " ".repeat(level)+data+"\n";
		for(TreeNode node : this.children) {
			ret = ret + node.print(level +3);
		}
		return ret;
	}
}
