package com.mozss.algorithms.common.structure;

public class TreeNode {
	public int val;
	// 注意这里的left和right的定义
	// 这里是递归的定义
	public TreeNode left;
	public TreeNode right;
	TreeNode(){}
	
	TreeNode(int val){
		this.val = val;
	}
	
	TreeNode(int val, TreeNode left, TreeNode right){
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
