package com.mozss.pattern23.design11behavior.behavior11memento.sample_03;

public class Original {
	private String value;
	
	public Original(String value) {
		this.value = value;
	}
	
	public Memento createMemento() {
		return new Memento(value);
	}
	
	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
