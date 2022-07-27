package com.mozss.pattern23.design11behavior.behavior05command.sample;

public class CommandConcrete_02 extends Command {
	//对那个Receiver类进行命令处理
	private Receiver receiver;
	
	
	/**
	 * 构造函数传递接收者
	 *
	 * @param _receiver
	 */
	public CommandConcrete_02(Receiver _receiver) {
		this.receiver = _receiver;
	}
	
	/**
	 * 必须实现一个命令
	 */
	@Override
	public void execute() {
		//业务处理
		this.receiver.doSomething();
	}
}
