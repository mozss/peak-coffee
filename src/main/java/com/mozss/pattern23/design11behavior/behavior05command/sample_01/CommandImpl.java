package com.mozss.pattern23.design11behavior.behavior05command.sample_01;

public class CommandImpl extends Command {
	public CommandImpl(Receiver receiver) {
		super(receiver);
	}
	
	@Override
	public void execute() {
		receiver.receive();
	}
}
