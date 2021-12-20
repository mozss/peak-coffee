package com.mozss.common.mystructure.list;

public class MyLinkedListDouble {
	/*
	 * No.707题：
	 *
	 * Your MyLinkedList object will be instantiated and called as such:
	 * MyLinkedList obj = new MyLinkedList();
	 * int param_1 = obj.get(index);
	 * obj.addAtHead(val);
	 * obj.addAtTail(val);
	 * obj.addAtIndex(index,val);
	 * obj.deleteAtIndex(index);
	 * */
	
	/**
	 *内部类-构造节点类
	 */
	private class ListNode{
		int val;
		//不同于单链表, 这里需要两个指针
		ListNode next;
		ListNode prev;
		ListNode(int x){
			val = x;
		}
	}
	
	int size;
	//构造伪头和伪尾的哨兵节点
	ListNode head, tail;
	
	/**
	 * 初始化操作
	 */
	public MyLinkedListDouble() {
		size = 0;
		head = new ListNode(0);
		tail = new ListNode(0);
		//把值覆盖指针，指针就指向这个值
		head.next = tail;
		tail.prev = head;
	}
	
	/**
	 * Add a node of value val before the index-th node in the linked list。
	 *  -如果index等于链表的长度,该节点附加到链表的末尾；
	 *  -如果index大于链表的长度,则不会插入节点；
	 *  -如果index小于0,则在头部插入节点。
	 * @param index
	 * @param val
	 */
	public void addAtIndex(int index, int val) {
		if(index > size){
			return;
		}
		
		if(index < 0){
			index = 0;
		}
		
		//首先定义被添加节点的 前驱和后继节点, 这里是指针
		ListNode pred, succ;
		/*
		* 注意这里的if条件, index < size - index
		* 可以转换成: index + index < size
		* 也就是说, index < size / 2
		*
		 * */
		if(index < size - index){
			//从前往后找, 顺着索引, 逐个找
			pred = head;
			for (int i = 0; i < index; i++) {
				//找到前驱
				pred = pred.next;
			}
			succ = pred.next;
		}else{
			//从后往前找, 顺着索引, 逐个找
			succ = tail;
			for (int i = 0; i < size - index; i++) {
				//找到后继
				succ = succ.prev;
			}
			pred = succ.prev;
		}
		
		//插入操作
		++size;
		ListNode toAdd = new ListNode(val);
		toAdd.prev = pred;
		toAdd.next = succ;
		pred.next = toAdd;
		succ.prev = toAdd;
		
	}
	
	/**
	 * 如果索引有效,则删除链表中的第index节点
	 * @param index
	 */
	public void deleteAtIndex(int index) {
		//如果索引不可用
		if(index < 0 || index > size){
			return;
		}
		//删除需要删除的节点
		ListNode pred, succ;
		if(index < size - index){
			pred = head;
			for (int i = 0; i < index; i++) {
				pred = pred.next;
			}
			succ = pred.next.next;
		}else {
			succ = tail;
			for (int i = 0; i < size - index - 1; i++) {
				succ = succ.prev;
			}
			pred = succ.prev.prev;
		}
	}
	
	/**
	 * 获取链表中第index的节点
	 * @param index
	 * @return
	 */
	public int get(int index) {
		//定义目标节点
		ListNode curr = head;
		
		//如果索引无效,返回-1
		if(index < 0 || index >=size){
			return -1;
		}
		//选择最快的方式定位索引 (size-1)/2
		if (index + 1 < size - index){
			for (int i = 0; i < index + 1; i++) {
				curr =curr.next;
			}
		}else{
			curr = tail;
			for (int i = 0; i < size - index; i++) {
				curr = curr.prev;
			}
		}
		return curr.val;
	}
	
	/**添加元素到链表头部
	 * @param val
	 */
	public void addAtHead(int val) {
		ListNode pred = head;
		ListNode succ = head.next;
		
		++size;
		ListNode toAdd = new ListNode(val);
		toAdd.prev = pred;
		toAdd.next = succ;
		pred.next = toAdd;
		succ.prev = toAdd;
	}
	
	/**添加元素到链表尾部
	 * @param val
	 */
	public void addAtTail(int val) {
		ListNode succ = tail;
		ListNode pred = tail.prev;
		
		++size;
		ListNode toAdd = new ListNode(val);
		toAdd.prev = pred;
		toAdd.next = succ;
		pred.next = toAdd;
		succ.prev = toAdd;
	}
	
}
