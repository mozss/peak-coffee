package com.mozss.pattern23.design11behavior.behavior02interpreter_class.sample_01;


public class Client {
	public static void main(String[] args) {
		Context ctx = new Context();
		ctx.add(new SimpleExpression());
		ctx.add(new AdvanceExpression());
		ctx.add(new SimpleExpression());
		
		for (Expression eps :
				ctx.getList()) {
			eps.interpret(ctx);
		}
	}
}
