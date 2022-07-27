package com.mozss.pattern23.design11behavior.behavior07observer.sample_01;

public class Main {
	public static void main(String[] args) {
		Policeman thPol = new TianHePoliceman();
		Policeman hpPol = new HuangPuPoliceman();
		
		Citizen citizen = new HuangPuCitizen(hpPol);
		citizen.sendMessage("unnormal");
		citizen.sendMessage("normal");
		
		System.out.println("==========");
		citizen = new TianHeCitizen(thPol);
		citizen.sendMessage("normal");
		citizen.sendMessage("unnormal");
	}
}
