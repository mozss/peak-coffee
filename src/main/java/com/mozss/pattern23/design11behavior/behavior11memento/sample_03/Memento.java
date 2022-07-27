package com.mozss.pattern23.design11behavior.behavior11memento.sample_03;

public class Memento {
	private String value;
	
	public Memento(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue() {
		this.value = value;
	}
}
