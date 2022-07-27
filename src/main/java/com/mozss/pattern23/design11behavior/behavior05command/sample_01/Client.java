package com.mozss.pattern23.design11behavior.behavior05command.sample_01;

public class Client {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command cmd = new CommandImpl(receiver);
		Invoker i = new Invoker();
		i.setCommand(cmd);
		i.execute();
	}
}
