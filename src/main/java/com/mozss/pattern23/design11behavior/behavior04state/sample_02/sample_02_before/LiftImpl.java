package com.mozss.pattern23.design11behavior.behavior04state.sample_02.sample_02_before;

/**
 * <pre>
 * 这种方式实现的问题:
 * 1. LiftImpl.java 这个类有点长: 大量的switch...case语句无法带来良好的维护性
 * 2. 扩展性非常差距: 目前只设置了两个状态, 如果还想加入"通电"和"断点"状态, 需要在Open()等四个方法中添加判断条件. 也就是与"开闭原则"违背
 * 3. 非常规状态无法实现:
 * </pre>
 */
public class LiftImpl implements LiftI {
	private int state;
	
	@Override
	public void setState(int state) {
		this.state = state;
	}
	
	//存粹的关门, 不考虑实际的逻辑
	private void closeWithoutLogic() {
		System.out.println("电梯门关闭...");
	}
	
	//存粹的开门, 不考虑任何条件
	private void openWithoutLogic() {
		System.out.println("电梯门开启...");
	}
	
	//存粹的运行, 不考虑其他条件
	private void runWithoutLogic() {
		System.out.println("电梯运行起来...");
	}
	
	//单纯的停止, 不考虑其他条件
	private void stopWithoutLogic() {
		System.out.println("电梯停止运行...");
	}
	
	
	@Override
	public void close() {
		switch (this.state) {
			case OPEN_STATE: //可以关门, 同时修改电梯状态
				this.closeWithoutLogic();
				this.setState(CLOSE_STATE);
				break;
			case CLOSE_STATE://电梯关门状态, 什么都不做
				//do nothing
				break;
			case RUN_STATE://正在运行, 门本来就是关闭的, 什么都不做
				//do nothing
				break;
			case STOP_STATE://停止状态, 门也是关闭的, 什么都不做
				//do nothing
				break;
		}
	}
	
	@Override
	public void open() {
		switch (this.state) {
			case OPEN_STATE: //开门状态, 什么都不做
				//do nothing
				break;
			case CLOSE_STATE: //闭门状态, 什么都不做
				this.openWithoutLogic();
				this.setState(OPEN_STATE);
				break;
			case RUN_STATE: //运行状态, 什么都不做
				//do nothing
				break;
			case STOP_STATE: //停止状态, 当然要开门了
				this.openWithoutLogic();
				this.setState(OPEN_STATE);
				break;
		}
	}
	
	@Override
	public void run() {
		switch (this.state) {
			case OPEN_STATE: //开门状态, 什么都不做
				//do nothing
				break;
			case CLOSE_STATE: //关门状态, 可以运行
				this.runWithoutLogic();
				this.setState(RUN_STATE);
				break;
			case RUN_STATE: //运行状态, 什么都不做
				//do nothing
				break;
			case STOP_STATE: //停止状态, 可以运行
				this.runWithoutLogic();
				this.setState(RUN_STATE);
		}
	}
	
	@Override
	public void stop() {
		switch (this.state) {
			case OPEN_STATE: //开门状态, 要先停下来, 什么都不做
				//do nothing
				break;
			case CLOSE_STATE: //闭门状态, 可以停止
				this.stopWithoutLogic();
				this.setState(CLOSE_STATE);
				break;
			case RUN_STATE: //运行状态, 当然要停止
				this.stopWithoutLogic();
				this.setState(CLOSE_STATE);
				break;
			case STOP_STATE: //停止状态, 什么都不做
				//do nothing
				break;
		}
	}
}
