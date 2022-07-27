package com.mozss.pattern23.design7structural.structural06composite.sample_01;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		Employer pm = new ProjectManager("项目经理");
		Employer pa = new ProjectAssistant("项目助理");
		Employer coder1 = new Programmer("程序员1");
		Employer coder2 = new Programmer("程序员2");
		
		pm.add(pa);
		pm.add(coder2);
		
		List<Employer> ems = pm.getEmployers();
		for (Employer em :
				ems) {
			System.out.println(em.getName());
		}
	}
}
