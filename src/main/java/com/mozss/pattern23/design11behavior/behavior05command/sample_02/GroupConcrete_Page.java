package com.mozss.pattern23.design11behavior.behavior05command.sample_02;

public class GroupConcrete_Page extends Group {
	/**
	 * 甲乙双方分开办公, 如果你要和某个组讨论, 你首先要找到这个组
	 */
	@Override
	public void find() {
		System.out.println("找到美工组");
	}
	
	/**
	 * 被要求增加功能
	 */
	@Override
	public void add() {
		System.out.println("客户要求新增一个页面...");
	}
	
	/**
	 * 被要求删除功能
	 */
	@Override
	public void delete() {
		System.out.println("客户要求删除一个页面...");
	}
	
	/**
	 * 被要求修改功能
	 */
	@Override
	public void change() {
		System.out.println("客户要求修改一个页面...");
	}
	
	/**
	 * /被要求给出所有的变更计划
	 */
	@Override
	public void plan() {
		System.out.println("客户要求出页面变更计划...");
	}
}
