package com.mozss.pattern23.design11behavior.behavior02interpreter_class.sample_01;

import java.util.ArrayList;
import java.util.List;

public class Context {
	private String content;
	private List<Expression> list = new ArrayList<Expression>();
	
	public String getContent() {
		return content;
	}
	
	public void add(Expression eps) {
		list.add(eps);
	}
	
	public List<Expression> getList() {
		return list;
	}
	
}
