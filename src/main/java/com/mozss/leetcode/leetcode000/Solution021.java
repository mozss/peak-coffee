package com.mozss.leetcode.leetcode000;

import com.mozss.common.structure.ListNodeSingle;

public class Solution021 {
	public ListNodeSingle mergeTwoLists(ListNodeSingle l1, ListNodeSingle l2) {
		// 1->2->4
		// 1->3->4
		//约束
		if(l1 == null && l2 == null){
			return null;
		}
		ListNodeSingle currNode = null;
		ListNodeSingle l1currNode = l1;
		ListNodeSingle l2currNode = l2;
		while(l1currNode.next != null && l2currNode.next != null){
			currNode = (l1currNode.val < l2currNode.val) ? l1currNode: l2currNode;
			l1currNode = l1currNode.next;
			l2currNode = l2currNode.next;
		}
		if(l1.next == null && l2.next != null){
			currNode = l2currNode;
		}
		if(l1.next != null && l2.next == null){
			currNode = l1currNode;
		}
		return currNode;
	}
}
