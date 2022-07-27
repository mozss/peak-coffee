package com.mozss.pattern23.design11behavior.behavior03strategy.sample;

/**
 * 抽象模式就是这么简单, 采用了面向对象的继承和多态机制, 没有什么玄机
 */
public class Client {
	public static void main(String[] args) {
		//声明一个具体的策略
		Strategy strategy = new StrategyImpl_01();
		
		//声明上下文对象
		Context context = new Context(strategy);
		
		//执行封装后的方法
		context.doAnything();
	}
}
