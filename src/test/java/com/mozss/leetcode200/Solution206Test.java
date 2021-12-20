package com.mozss.leetcode200;

import com.mozss.structure.ListNodeSingle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Solution206Test {
	
	@BeforeEach
	void setUp() {
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	void reverseList() {
		Solution206 solution206 = new Solution206();
		
		ListNodeSingle listNode1 = new ListNodeSingle(1);
		ListNodeSingle listNode2 = new ListNodeSingle(2);
		ListNodeSingle listNode3 = new ListNodeSingle(3);
		ListNodeSingle listNode4 = new ListNodeSingle(4);
		ListNodeSingle listNode5 = new ListNodeSingle(5);
		
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		listNode5.next = null;
		
		//输入单链表的头节点head
		System.out.println(solution206.reverseList(listNode5).val);
		
		System.out.println(listNode1.val);
		System.out.println(listNode2.val);
		System.out.println(listNode3.val);
		System.out.println(listNode4.val);
		System.out.println(listNode5.val);
		
	}
}