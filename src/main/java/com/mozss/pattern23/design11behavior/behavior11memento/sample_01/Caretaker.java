package com.mozss.pattern23.design11behavior.behavior11memento.sample_01;

public class Caretaker {
	private Memento memento;
	
	public Memento getMemento() {
		return this.memento;
	}
	
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
