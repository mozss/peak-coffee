package com.mozss.pattern23.design7structural.structural06composite.sample_01;

import java.util.List;

public abstract class Employer {
	public List<Employer> employers;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void add(Employer employer);
	
	public abstract void delete(Employer employer);
	
	public void printInfo() {
		System.out.println(name);
	}
	
	public List<Employer> getEmployers() {
		return this.employers;
	}
}
