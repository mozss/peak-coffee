package com.mozss.pattern23.design11behavior.behavior05command.sample;

public class Invoker {
	private Command command;
	
	
	/**
	 * 受气包, 接收命令
	 *
	 * @param _command
	 */
	public void setCommand(Command _command) {
		this.command = _command;
	}
	
	/**
	 * 执行命令
	 */
	public void action() {
		this.command.execute();
	}
}
