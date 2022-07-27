package com.mozss.pattern23.design11behavior.behavior11memento.sample_03;

public class Storage {
	private Memento memento;
	
	public Storage(Memento memento) {
		this.memento = memento;
	}
	
	public Memento getMemento() {
		return memento;
	}
	
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
