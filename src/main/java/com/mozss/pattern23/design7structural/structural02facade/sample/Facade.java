package com.mozss.pattern23.design7structural.structural02facade.sample;

/**
 * 门面对象
 */
public class Facade {
	
	/**
	 * 被委托的对象
	 */
	private ClassA classA = new ClassA();
	private ClassB classB = new ClassB();
	private ClassC classC = new ClassC();
	
	/**
	 * 提供给外部访问的方法
	 */
	public void methodA() {
		classA.doSomethingA();
	}
	
	public void methodB() {
		classB.doSomethingB();
	}
	
	public void methodC() {
		classC.doSomethingC();
	}
}
