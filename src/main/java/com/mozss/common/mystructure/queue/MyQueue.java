package com.mozss.common.mystructure.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	//定义存储数据结构
	private List<Integer> data;
	//指向开始位置的指针
	private int p_start;
	public MyQueue(){
		data = new ArrayList<Integer>();
		p_start = 0;
	}
	//检查队列是否为空
	public boolean isEmpty(){
		return p_start >= data.size();
	}
	
	//插入一个元素到队列,如果成功则返回true
	public boolean enQueue(int x){
		data.add(x);
		return true;
	}
	//从队列中删除一个元素,如果成功则返回true
	public boolean deQueue(){
		if(isEmpty() == true){
			return false;
		}
		p_start ++;
		return true;
	}
	//获取队列的起点
	public int Front(){
		return data.get(p_start);
	}
	
	
	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.enQueue(5);
		q.enQueue(3);
		if (q.isEmpty() == false){
			System.out.println(q.Front());
		}
		q.deQueue();
		if(q.isEmpty() == false){
			System.out.println(q.Front());
		}
		q.deQueue();
		if(q.isEmpty() == false){
			System.out.println(q.Front());
		}
	}
}
