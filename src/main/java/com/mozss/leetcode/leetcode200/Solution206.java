package com.mozss.leetcode.leetcode200;

import com.mozss.common.structure.ListNodeSingle;

public class Solution206 {
	public ListNodeSingle reverseList(ListNodeSingle head) {
		//约束
		if(head == null){
			return null;
		}
		// 原：   1->2->3
		// 现：x<-1
		// 核心逻辑：把1->2 变为 x <- 1 ;比如第一次遍历的currNode为1
		ListNodeSingle prevNode = null;
		ListNodeSingle currNode = head;
		while(currNode != null){
			//下面逻辑1和3好确定，关键是2需要好好理解
			
			//1.currNode的去向next确定
			ListNodeSingle next = currNode.next;
			
			//2.当前节点的next指向prev，同时prevNode也需要确定值
			currNode.next = prevNode;
			prevNode = currNode;
			
			//4.遍历往后推进，currNode必然需要变为next
			currNode = next;
		}
		return prevNode;
	}
}
