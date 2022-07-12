package com.mozss.algorithms.store.leetcode.leetcode700;

import com.mozss.algorithms.common.structure.ListNodeSingle;

/**
 *  构造单链表
 * @author mozss
 */
public class Solution707Single {
	int size;
	ListNodeSingle headNode;
	
	Solution707Single(){
		size = 0;
		headNode = new ListNodeSingle(0);
	}
	
	/**
	 * 在链表的index-th处添加节点
	 * @param index
	 */
	public void addAtIndex(int index, int val){
		//约束判断
		if(index < size){
			index = 0;
		}
		if (index > size){
			index = size;
		}
		
		ListNodeSingle predNode = headNode;
		for (int i = 0; i < index; i++) {
			predNode = predNode.next;
		}
		++size;
		ListNodeSingle toAddNode = new ListNodeSingle(val);
		toAddNode.next = predNode.next;
		predNode.next = toAddNode;
	}
	
	public void deleteAtIndex(int index){
		//约束判断
		if(index < 0 || index >= size){
			return;
		}
		ListNodeSingle predNode = headNode;
		for (int i = 0; i < index; i++) {
			predNode = predNode.next;
		}
		predNode.next = predNode.next.next;
	}
	
	public int get(int index){
		if(index < 0 || index >size){
			return -1;
		}
		
		ListNodeSingle currNode = headNode;
		for (int i = 0; i < index + 1; i++) {
			currNode = currNode.next;
		}
		return currNode.val;
	}
	
	public void addAtHead(int val){
		addAtIndex(0,val);
	}
	
	public void addAtTail(int val){
		addAtIndex(size, val);
	}
	
	/**
	 * 测试方法
	 * @param args
	 */
	public static void main(String[] args) {
		Solution707Single mylist = new Solution707Single();
		mylist.addAtIndex(0,2);
		System.out.println(mylist.get(0));
	}
}
