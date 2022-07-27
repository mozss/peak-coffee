package com.mozss.pattern23.design11behavior.behavior05command.sample_01;

public class Invoker {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void execute() {
		command.execute();
	}
}
