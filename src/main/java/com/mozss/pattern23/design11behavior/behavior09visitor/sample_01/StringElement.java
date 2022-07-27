package com.mozss.pattern23.design11behavior.behavior09visitor.sample_01;

public class StringElement implements Visitable {
	private String se;
	
	public StringElement(String se) {
		this.se = se;
	}
	
	public String getSe() {
		return this.se;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visitString(this);
	}
}
