package com.mozss.algorithms.sections.structure.linear04_stack;

import java.util.ArrayList;

/**
 * 这里使用动态数组的方式实现栈
 */
public class MyStack {
	private ArrayList<Integer> data;
	
	public MyStack() {
		data = new ArrayList<>();
	}
	
	/**
	 * 栈中插入一个元素
	 * @param x
	 */
	public void push(int x){
		data.add(x);
	}
	
	/**
	 * 检查栈是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return data.isEmpty();
	}
	
	/**
	 * 获取栈的第一个元素
	 * 这里只是简单处理了为空的请求,赋默认值0
	 * @return
	 */
	public int top(){
		if (!isEmpty()){
			return data.get(data.size()-1);
		}else {
			return 0;
		}
	}
	
	/**
	 * 删除栈的一个元素
	 * @return
	 */
	public boolean pop(){
		if (isEmpty()){
			return false;
		}
		data.remove(data.size() -1);
		return true;
	}
	
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		for (int i = 0; i < 3; i++) {
			if(!myStack.isEmpty()){
				System.out.println(myStack.top());
			}
			myStack.pop();
		}
	}
}
