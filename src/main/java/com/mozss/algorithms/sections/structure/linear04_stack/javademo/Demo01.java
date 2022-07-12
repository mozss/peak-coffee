package com.mozss.algorithms.sections.structure.linear04_stack.javademo;

import java.util.Stack;

public class Demo01 {
	public static void main(String[] args) {
		//1.初始化一个栈
		Stack<Integer> stack = new Stack<>();
		//2.push操作
		stack.push(6);
		stack.push(3);
		stack.push(23);
		//3. isEmpty
		if (stack.isEmpty()){
			System.out.println("Stack is not empty");
		}
		//4.pop操作
		System.out.println("pop一个元素:" + stack.pop());
		//5.获取顶部元素
		System.out.println("顶部元素是:"+ stack.peek());
		//6.获取stack的长度
		System.out.println("stack的长度为" + (stack.size() + 1));
		
	}
}
