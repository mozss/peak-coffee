package com.mozss.leetcode.leetcode200;

import com.mozss.common.structure.ListNodeSingle;

public class Solution237 {
	public void deleteNode(ListNodeSingle node){
		node.val = node.next.val;
		node.next = node.next.next;
	}
}