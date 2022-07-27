package com.mozss.pattern23.design11behavior.behavior05command.sample_01;

public abstract class Command {
	protected Receiver receiver;
	
	protected Command(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public abstract void execute();
}
