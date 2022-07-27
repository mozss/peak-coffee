package com.mozss.pattern23.design11behavior.behavior05command.sample_02;

/**
 * 抽象命令类
 */
public abstract class Command {
	
	/**
	 * 需求组
	 */
	protected GroupConcrete_Requirement groupConcrete_requirement = new GroupConcrete_Requirement();
	
	/**
	 * 美工组
	 */
	protected GroupConcrete_Page groupConcrete_page = new GroupConcrete_Page();
	
	/**
	 * 代码组
	 */
	protected GroupConcrete_Code groupConcrete_code = new GroupConcrete_Code();
	
	/**
	 * 只有一个方法, 你要我做什么事情
	 */
	public abstract void execute();
}
