package com.mozss.pattern23.design11behavior.behavior07observer.sample;

public class Client {
	public static void main(String[] args) {
		//创建一个被观察者
		SubjectConcrete subjectConcrete = new SubjectConcrete();
		//定义一个观察者
		Observer obs = new ObserverImpl();
		//观察者 观察->被观察者
		subjectConcrete.addObserver(obs);
		//观察者 开始活动了
		subjectConcrete.doSomething();
	}
}
