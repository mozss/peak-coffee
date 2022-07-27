package com.mozss.pattern23.design11behavior.behavior07observer.sample;

/**
 * 具体的被观察者
 */
public class SubjectConcrete extends Subject {
	//具体的业务
	public void doSomething() {
		//do something
		super.notifyObserver();
	}
}
