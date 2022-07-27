package com.mozss.pattern23.design11behavior.behavior07observer.sample_01;

public class TianHePoliceman implements Policeman {
	@Override
	public void action(Citizen ci) {
		String help = ci.getHelp();
		if (help.equals("normal")) {
			System.out.println("天河地区,一切正常,不用出警。");
		}
		if (help.equals("unnormal")) {
			System.out.println("天河地区,有犯罪行为,警察出动！");
		}
	}
}
