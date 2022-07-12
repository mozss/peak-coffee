package com.mozss.algorithms.sections.structure.nonlinear07_tree.tree;

import com.mozss.algorithms.common.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Traversal_Order_Pre {
	
	public List<Integer> preOrderTraversal(TreeNode root){
		//用一个list来接收结果
		List<Integer> resultList = new ArrayList<Integer>();
		preOrder(root, resultList);
		return resultList;
	}
	
	private void preOrder(TreeNode root, List<Integer> list) {
		if (root == null){
			return;
		}
		
		list.add(root.val);
		preOrder(root.left, list);
		preOrder(root.right, list);
		
	}
}
