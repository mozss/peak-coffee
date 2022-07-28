package com.mozss.algorithms.structure.linear01_list;

public class MyLinkedListSingle {
	/**
	 * No.707题：
	 * <p>
	 * Your MyLinkedList object will be instantiated and called as such:
	 * MyLinkedList obj = new MyLinkedList();
	 * int param_1 = obj.get(index);
	 * obj.addAtHead(val);
	 * obj.addAtTail(val);
	 * obj.addAtIndex(index,val);
	 * obj.deleteAtIndex(index);
	 */
	
	int size;
	//伪节点
	ListNode head;
	
	/**
	 * 初始化,链表size=0
	 */
	public MyLinkedListSingle() {
		size = 0;
		head = new ListNode(0);
	}
	
	/**
	 * 在链表中的第index节点之前添加值为val的节点。
	 * -如果index等于链表的长度，则该节点将附加到链表的末尾；
	 * -如果index大于链表长度，则不会插入节点；
	 * -如果index小于0，则在头部插入节点。
	 * <p>
	 * 添加操作需要两个参数: 插入的索引; 插入的值
	 *
	 * @param index
	 * @param val
	 */
	public void addAtIndex(int index, int val) {
		//索引长度超过链表长度
		if (index > size) {
			return;
		}
		//索引长度小于链表长度, 索引赋值为0
		if (index < 0) {
			index = 0;
		}
		++size;
		
		//首先定义 被添加节点的前驱(删除操作也需要)
		ListNode pred = head;
		for (int i = 0; i < index; ++i) {
			//pred这里如同一个游标,从head开始,顺着索引,不断改变值,直到抵达索引位置
			pred = pred.next;
		}
		
		//被添加的节点
		ListNode toAdd = new ListNode(val);
		//插入
		toAdd.next = pred.next;
		pred.next = toAdd;
	}
	
	/**
	 * 获取链表中第index个节点的值。如果索引无效，则返回-1
	 *
	 * @param index
	 * @return
	 */
	public int get(int index) {
		//如果索引不可用
		if (index < 0 || index >= size) {
			return -1;
		}
		
		ListNode curr = head;
		//index steps needed
		//to move from sentinel node to wanted index
		for (int i = 0; i < index + 1; i++) {
			curr = curr.next;
		}
		return curr.val;
	}
	
	/**
	 * 在链表的第一个元素之前添加一个值val的节点。插入后，新节点将成为链表的第一个节点
	 *
	 * @param val
	 */
	public void addAtHead(int val) {
		addAtIndex(0, val);
	}
	
	/**
	 * 值为val的节点追加到链表的最后一个元素。
	 *
	 * @param val
	 */
	public void addAtTail(int val) {
		addAtIndex(size, val);
	}
	
	/**
	 * 如果索引index有效，则删除链表中的第index节点
	 * 删除操作只需要一个参数, 即索引值
	 *
	 * @param index
	 */
	public void deleteAtIndex(int index) {
		//如果索引可不用
		if (index < 0 || index >= size) {
			return;
		}
		size--;
		//找到需要删除的node
		ListNode pred = head;
		for (int i = 0; i < index; i++) {
			pred = pred.next;
		}
		//删除
		pred.next = pred.next.next;
	}
	
	/**
	 * 构造节点
	 */
	private class ListNode {
		int val;
		ListNode next;
		
		ListNode(int x) {
			val = x;
		}
	}
	
}
