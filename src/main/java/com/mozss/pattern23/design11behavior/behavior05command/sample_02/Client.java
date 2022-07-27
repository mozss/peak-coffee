package com.mozss.pattern23.design11behavior.behavior05command.sample_02;

public class Client {
	public static void main(String[] args) {
		//定义我们的接头人 bob
		Invoker bob = new Invoker();
		
		//客户要求增加一项需求
		System.out.println("----------客户说: 删除一个页面----------");
		
		//客户给我们下命令来
		Command command = new CommanConcrete_DeletePage();
		
		//接头人接收到这个命令
		bob.setCommand(command);
		
		//接头人执行命令
		bob.action();
	}
}
