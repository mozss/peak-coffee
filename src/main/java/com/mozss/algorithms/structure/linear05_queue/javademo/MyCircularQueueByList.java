package com.mozss.algorithms.structure.linear05_queue.javademo;

/**
 * 使用单链表实现队列
 */
public class MyCircularQueueByList {
	
	private Node head, tail;
	private int count;
	private int capacity;
	
	/**
	 * 初始化数据结构
	 *
	 * @param k
	 */
	public MyCircularQueueByList(int k) {
		this.capacity = k;
	}
	
	public boolean enQueue(int value) {
		if (this.count == this.capacity) {
			return false;
		}
		
		Node newNode = new Node(value);
		if (this.count == 0) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		this.count += 1;
		return true;
	}
	
	public boolean deQueue() {
		if (this.count == 0) {
			return false;
		}
		this.head = this.head.next;
		this.count -= 1;
		return true;
	}
	
	/**
	 * 获取队列的第一个元素
	 *
	 * @return
	 */
	public int Front() {
		if (this.count == 0) {
			return -1;
		} else {
			return this.head.val;
		}
	}
	
	/**
	 * 获取队列的最后一个元素
	 *
	 * @return
	 */
	public int Rear() {
		if (this.count == 0) {
			return -1;
		} else {
			return this.tail.val;
		}
	}
	
	/**
	 * 检查这个循环队列是否已空
	 *
	 * @return
	 */
	public boolean isEmpty() {
		return (this.count == 0);
	}
	
	/**
	 * 检查这个循环队列是否已满
	 *
	 * @return
	 */
	public boolean isFull() {
		return (this.count == this.capacity);
	}
	
	/**
	 * 构造单链表的节点
	 */
	private class Node {
		int val;
		Node next;
		
		Node(int x) {
			val = x;
		}
	}
}

