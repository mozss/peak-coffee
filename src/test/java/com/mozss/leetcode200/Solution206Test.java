package com.mozss.leetcode200;

import com.mozss.structure.ListNode;
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
		
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);
		
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