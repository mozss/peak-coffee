package com.mozss.algorithms.structure.linear05_queue.javademo;

import java.util.concurrent.locks.ReentrantLock;

public class MyCircularQueueSafe {
	private Node head, tail;
	private int count;
	private int capacity;
	//用于保护队列的变量
	private ReentrantLock queueLock = new ReentrantLock();
	
	/**
	 * 初始化数据结构
	 *
	 * @param k
	 */
	public MyCircularQueueSafe(int k) {
		this.capacity = k;
	}
	
	/**
	 * 向队列中插入元素
	 *
	 * @param value
	 * @return
	 */
	public boolean enQueue(int value) {
		queueLock.lock();
		try {
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
			
		} finally {
			queueLock.unlock();
		}
		return true;
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




























