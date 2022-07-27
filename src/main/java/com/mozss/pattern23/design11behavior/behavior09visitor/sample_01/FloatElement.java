package com.mozss.pattern23.design11behavior.behavior09visitor.sample_01;

public class FloatElement implements Visitable {
	private Float fe;
	
	public FloatElement(Float fe) {
		this.fe = fe;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visitFloat(this);
	}
	
	public Float getFe() {
		return this.fe;
	}
}
