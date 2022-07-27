package com.mozss.pattern23.design11behavior.behavior09visitor.sample_01;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		Visitor visitor = new ConcreteVisitor();
		StringElement se = new StringElement("abc");
		se.accept(visitor);
		
		FloatElement fe = new FloatElement(new Float(1.5));
		fe.accept(visitor);
		System.out.println("==========");
		List result = new ArrayList();
		result.add(new StringElement("abc"));
		result.add(new StringElement("abc"));
		result.add(new StringElement("abc"));
		result.add(new FloatElement(new Float(1.5)));
		result.add(new FloatElement(new Float(1.5)));
		result.add(new FloatElement(new Float(1.5)));
		visitor.visitCollection(result);
	}
}
