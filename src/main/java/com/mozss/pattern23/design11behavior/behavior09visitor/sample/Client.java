package com.mozss.pattern23.design11behavior.behavior09visitor.sample;

/**
 * 这里例子的ObjectStructure.java中结合了工厂模式
 */
public class Client {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			//获得元素对象
			ElementAbs e1 = ObjectStructure.createElement();
			
			//接受访问者访问
			e1.accept(new VisitorImpl());
		}
	}
}
