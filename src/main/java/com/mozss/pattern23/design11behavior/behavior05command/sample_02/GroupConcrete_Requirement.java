package com.mozss.pattern23.design11behavior.behavior05command.sample_02;

public class GroupConcrete_Requirement extends Group {
	/**
	 * 客户要求需求组过去和他们讨论
	 */
	@Override
	public void find() {
		System.out.println("找到需求组...");
	}
	
	@Override
	public void add() {
		System.out.println("客户要求增加一项需求...");
	}
	
	@Override
	public void delete() {
		System.out.println("客户要求删除一项需求...");
	}
	
	@Override
	public void change() {
		System.out.println("客户要求变需求...");
	}
	
	@Override
	public void plan() {
		System.out.println("客户要求出一份变更计划");
	}
}
