package com.mozss.algorithms.store.leetcode.leetcode100;


import com.mozss.algorithms.common.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution144 {
	public List<Integer> preorderTraversal(TreeNode root){
		List<Integer> resultList = new ArrayList<Integer>();
		preorder(root,resultList);
		return resultList;
	}
	
	public void preorder(TreeNode root, List<Integer> resultList){
		if(root == null){
			return;
		}
		resultList.add(root.val);
		preorder(root.left, resultList);
		preorder(root.right,resultList);
	}
}
