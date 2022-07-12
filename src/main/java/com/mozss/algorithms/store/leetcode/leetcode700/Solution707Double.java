package com.mozss.algorithms.store.leetcode.leetcode700;

import com.mozss.algorithms.common.structure.ListNodeDouble;

/**
 * 构造双链表
 * @author mozss
 */
public class Solution707Double {
	/**
	 * 3个初始变量： size；哨兵伪头；哨兵伪尾。
	 */
	int size;
	ListNodeDouble headNode;
	ListNodeDouble tailNode;
	
	/**
	 * 初始化操作；
	 *      size = 0
	 *      “伪头”和“伪尾”初始化，并建立联系
	 */
	public Solution707Double(){
		size = 0;
		headNode = new ListNodeDouble(0);
		tailNode = new ListNodeDouble(0);
		headNode.next = tailNode;
		tailNode.prev = headNode;
	}
	
	/**
	 * 链表的重要操作：在链表的index-th处添加一个值
	 */
	public void addAtIndex(int index, int val){
		//约束条件
		if(index > size){
			return;
		}
		if(index < 0){
			index = 0;
			//或者这里调用addAtHead()方法
		}
		//“待添加节点”的 predNode-前驱 succNode-后继
		ListNodeDouble predNode;
		ListNodeDouble succNode;
		/*
		 * 下面的过程理解有难度：
		 *
		 * 顺着索引，逐个去找。这里根据距size/2的距离，优化了查找。
		 * 前->后：
		 * index < size / 2
		 * index + index < size
		 * index < size - index （优化）
		 * 前<-后：
		 * index > size / 2
		 *
		 * 由于我们定义了伪头head和伪尾tail，所以head和tail的值是已知的。
		 * 前->后，可以先predNode = headNode，这样preNode初始值就确定了，通过遍历，找到index对应的predNode
		 * predNode确定后，succNode就可以确定了，即succNode = predNode.next
		 *
		 * 同理：
		 * 前<-后，可以先succNode = tailNode，这样succNode初始值就确定了，通过遍历，找到index对应的succNode
		 * succNode确定后，predNode就可以确定了，即predNode = succNode.prev
		 */
		if (index < size - index){
			predNode = headNode;
			for(int i = 0; i < index; i++){
				//找到前驱：从pred=headNode，一直捋到pred=pred.next
				predNode = predNode.next;
			}
			succNode = predNode.next;
		}else {
			//从后往前找，顺着索引，逐个找
			succNode = tailNode;
			for(int i = 0; i < size - index; i++){
				//找到后继
				succNode = succNode.prev;
			}
			predNode = succNode.prev;
		}
		
		/*
		 * 上面的逻辑确定predNode和succNode，然后将新加入的节点toAddNode加入
		 *  首先：toAddNode的指针挂载到“前驱”和“后继”
		 *  然后：“前驱”的next指针，“后继”的prev指针，挂载到toAddNode上
		 */
		++ size;
		ListNodeDouble toAddNode = new ListNodeDouble(val);
		toAddNode.prev = predNode;
		toAddNode.next = succNode;
		predNode.next = toAddNode;
		succNode.prev = toAddNode;
	}
	
	/**
	 * 链表的重要操作：将链表的index-th节点删除
	 */
	public void deleteAtIndex(int index){
		//约束条件
		if(index < 0 || index >= size) {
			return;
		}
		
		ListNodeDouble predNode, succNode;
		if(index < size - index){
			predNode = headNode;
			for(int i = 0; i < index; i++){
				predNode = predNode.next;
			}
			succNode = predNode.next.next;
		}else{
			succNode = tailNode;
			for(int i = 0; i < size - index - 1; ++i){
				succNode = succNode.prev;
			}
			predNode = succNode.prev.prev;
		}
		--size;
		predNode.next = succNode;
		succNode.prev = predNode;
	}
	
	/**
	 * 获取链表的index-th的节点
	 */
	public int get(int index){
		if(index < 0 || index >= size){
			return -1;
		}
		ListNodeDouble currNode = headNode;
		if (index + 1 < size - index){
			currNode = currNode.next;
		}else {
			currNode = tailNode;
			for (int i = 0; i < size - index; ++i){
				currNode = currNode.prev;
			}
		}
		return currNode.val;
	}
	
	/**
	 * 链表头部添加节点
	 */
	public void addAtTail(int val){
		ListNodeDouble predNode = headNode;
		ListNodeDouble succNode = headNode.next;
		++size;
		ListNodeDouble toAddNode = new ListNodeDouble(val);
		toAddNode.prev = predNode;
		toAddNode.next = succNode;
		predNode.next = toAddNode;
		succNode.prev = toAddNode;
	}
	
	/**
	 * 链表尾部添加节点
	 */
	public void addAtHead(int val){
		ListNodeDouble succNode = tailNode;
		ListNodeDouble predNode = tailNode.prev;
		++size;
		ListNodeDouble toAddNode = new ListNodeDouble(val);
		toAddNode.prev = predNode;
		toAddNode.next = succNode;
		predNode.next = toAddNode;
		succNode.prev = toAddNode;
	}
	
	/**
	 * 测试方法
	 * @param args
	 */
	public static void main(String[] args) {
		Solution707Double mylist = new Solution707Double();
		//mylist链表中添加两个值：8，9，13
		mylist.addAtIndex(0,8);
		mylist.addAtIndex(1,9);
		System.out.println(mylist.get(0));
		System.out.println(mylist.get(1));
		mylist.deleteAtIndex(1);
		System.out.println(mylist.get(1));
		mylist.addAtHead(7);
		mylist.addAtTail(7);
		System.out.println("==========");
		for (int i = 0; i < mylist.size; i++) {
			System.out.println(mylist.get(i));
		}
	}
}
