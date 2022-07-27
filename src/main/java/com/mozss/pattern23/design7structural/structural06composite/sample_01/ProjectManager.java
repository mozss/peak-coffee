package com.mozss.pattern23.design7structural.structural06composite.sample_01;

import java.util.ArrayList;

/**
 * 定义Composite组合类
 */
public class ProjectManager extends Employer {
	public ProjectManager(String name) {
		setName(name);
		employers = new ArrayList<Employer>();
	}
	
	@Override
	public void add(Employer employer) {
		employer.add(employer);
	}
	
	@Override
	public void delete(Employer employer) {
		employer.delete(employer);
	}
}
