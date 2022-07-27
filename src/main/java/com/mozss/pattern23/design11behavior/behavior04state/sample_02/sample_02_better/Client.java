package com.mozss.pattern23.design11behavior.behavior04state.sample_02.sample_02_better;

/**
 * 这种方式下, Client场景类就很简单了, 只要定义一个电梯的初始状态, 然后调用相关的方法, 就完成了.
 * 完全不用考虑状态的变更, 运行结果完全相同.
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setLiftState(new LiftStateStopping());
		context.open();
		context.close();
		context.run();
		context.stop();
	}
}
