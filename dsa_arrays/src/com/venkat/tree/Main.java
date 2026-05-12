package com.venkat.tree;

public class Main {
	public static void main(String[] args) {
		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hot = new TreeNode("Hot");
		TreeNode cold = new TreeNode("Cold");
		drinks.addChild(hot);
		drinks.addChild(cold);
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffee = new TreeNode("coffee");
		TreeNode beer = new TreeNode("Beer");
		TreeNode wine = new TreeNode("Wine");
		hot.addChild(tea);
		hot.addChild(coffee);
		cold.addChild(beer);
		cold.addChild(wine);
		System.out.println(drinks.print(0));
	}
}
