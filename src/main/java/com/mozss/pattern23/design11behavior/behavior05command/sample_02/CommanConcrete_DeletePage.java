package com.mozss.pattern23.design11behavior.behavior05command.sample_02;

public class CommanConcrete_DeletePage extends Command {
	/**
	 * 只有一个方法, 你要我做什么事情
	 */
	@Override
	public void execute() {
		//找到页面组
		super.groupConcrete_page.find();
		
		//删除一个页面
		super.groupConcrete_requirement.delete();
		
		//给出计划
		super.groupConcrete_requirement.plan();
		
	}
}
