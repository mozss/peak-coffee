package com.mozss.pattern23.design11behavior.behavior05command.sample_02;

public class Invoker {
	
	/**
	 * 什么命令
	 */
	private Command command;
	
	/**
	 * 客户发出命令
	 */
	public void setCommand(Command _command) {
		this.command = _command;
	}
	
	/**
	 * 执行客户的命令
	 */
	public void action() {
		this.command.execute();
	}
}
