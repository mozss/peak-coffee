package com.mozss.pattern23.design11behavior.behavior11memento.sample_01;

public class Originator {
	private String state;
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void setMemento(Memento memento) {
		state = memento.getState();
	}
	
	public void showState() {
		System.out.println(state);
	}
}
