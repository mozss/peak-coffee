package com.mozss.leetcode200;

import com.mozss.structure.ListNode;

public class Solution206 {
	public ListNode reverseList(ListNode head){
		ListNode prev = null;
		ListNode curr = head;
		while(curr!= null){
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
