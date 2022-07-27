package com.mozss.pattern23.design11behavior.behavior03strategy.sample;

/**
 * 具体的策略角色
 */
public class StrategyImpl_02 implements Strategy {
	@Override
	public void doSomething() {
		System.out.println("具体策略2的运算法则");
	}
}
