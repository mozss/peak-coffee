package com.mozss.pattern23.design11behavior.behavior05command.sample;

public class Client {
	public static void main(String[] args) {
		//首先声明调用者Invoker
		Invoker invoker = new Invoker();
		
		//定义接受者
		Receiver receiver = new ReceiverConcrete_01();
		
		//定义一个发送给接收者的命令
		Command command = new CommandConcrete_01(receiver);
		
		//把命令交给调用者去执行
		invoker.setCommand(command);
		invoker.action();
	}
}
