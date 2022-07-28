package com.mozss.algorithms.structure.linear05_queue.javademo;/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 题目: No- 622 实现循环队列
 * 知识点:
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 描述:
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * eg 1>:
 * Input:
 * Output:
 * 说明:
 *
 * eg 2>:
 * Input:
 * Output:
 * 说明:
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 思路:
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

// 从并发性来看,该循环队列是线程不安全的。两个线程同时进行入队操作的情况，为竞态条件。
// MyCircularQueueSafe.java例子中，对enQueue(int value),并发安全的实现
public class MyCircularQueueByArray {
	private int[] queue;
	private int headIndex;
	private int count;
	private int capacity;
	
	/**
	 * 初始化数据结构
	 */
	public MyCircularQueueByArray(int k) {
		this.capacity = k;
		this.queue = new int[k];
		this.headIndex = 0;
		this.count = 0;
	}
	
	/**
	 * 从循环队列插入一个元素,操作成功返回ture
	 *
	 * @param value
	 * @return
	 */
	public boolean enQueue(int value) {
		if (this.count == this.capacity) {
			return false;
		}
		this.queue[(this.headIndex + this.count) % this.capacity] = value;
		this.count += 1;
		return true;
	}
	
	/**
	 * 从循环队列中删除一个元素,操作成功返回true
	 *
	 * @return
	 */
	public boolean deQueue() {
		if (this.count == 0) {
			return false;
		}
		this.headIndex = (this.headIndex + 1) % this.capacity;
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
		}
		return this.queue[this.headIndex];
	}
	
	/**
	 * 获取队列的最后一个元素
	 *
	 * @return
	 */
	public int Rear() {
		if (this.count == 0) {
			return -1;
		}
		int tailIndex = (this.headIndex + this.count - 1) % this.capacity;
		return this.queue[tailIndex];
	}
	
	/**
	 * 检查循环队列是否已空
	 *
	 * @return
	 */
	public boolean isEmpty() {
		return (this.count == 0);
	}
	
	/**
	 * 检查循环队列是否已满
	 *
	 * @return
	 */
	public boolean isFull() {
		return (this.count == this.capacity);
	}
}
