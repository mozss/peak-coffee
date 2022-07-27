package com.mozss.pattern23.design11behavior.behavior05command.sample_02;

public class CommandConcrete_AddRequirement extends Command {
	/**
	 * 只有一个方法, 你要我做什么事情
	 */
	@Override
	public void execute() {
		//找到需求组
		super.groupConcrete_requirement.find();
		
		//增加一份需求
		super.groupConcrete_requirement.add();
		
		//给出计划
		super.groupConcrete_requirement.plan();
	}
}
