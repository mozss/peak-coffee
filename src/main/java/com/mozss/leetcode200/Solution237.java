package com.mozss.leetcode200;

import com.mozss.structure.ListNodeSingle;

public class Solution237 {
	public void deleteNode(ListNodeSingle node){
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
