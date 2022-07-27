package com.mozss.pattern23.design11behavior.behavior04state.sample_02.sample_02_better;

/**
 * 上下文类
 */
public class Context {
	//定义出所有的电梯状态
	public final static LiftStateOpenning stateOpen = new LiftStateOpenning();
	public final static LiftStateClosing stateClose = new LiftStateClosing();
	public final static LiftStateRunning stateRun = new LiftStateRunning();
	public final static LiftStateStopping stateStop = new LiftStateStopping();
	
	//定义一个当前电梯状态
	private LiftStateAbs liftState;
	
	public LiftStateAbs getLiftState() {
		return liftState;
	}
	
	public void setLiftState(LiftStateAbs liftState) {
		this.liftState = liftState;
		//把当前的环境通知到各个实现类中
		this.liftState.setContext(this);
	}
	
	public void open() {
		this.liftState.open();
	}
	
	public void close() {
		this.liftState.close();
	}
	
	public void run() {
		this.liftState.run();
	}
	
	public void stop() {
		this.liftState.stop();
	}
}
