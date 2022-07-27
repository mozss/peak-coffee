package com.mozss.pattern23.design7structural.structural06composite.sample;

public class Client {
	public static void main(String[] args) {
		
		//创建一个根节点
		CompositeBranch root = new CompositeBranch();
		root.doSomething();
		
		
		//创建一个树枝构件
		CompositeBranch branch = new CompositeBranch();
		
		//创建一个叶子节点
		CompositeLeaf componentLeaf = new CompositeLeaf();
		
		//建立整体
		root.add(branch);
		branch.add(componentLeaf);
	}
	
	/**
	 * 通过递归遍历树
	 */
	public static void display(CompositeBranch root) {
		for (Component component : root.getChildren()) {
			if (component instanceof CompositeLeaf) {
				//叶子节点
				component.doSomething();
			} else {
				//树枝节点
				display((CompositeBranch) component);
			}
		}
	}
}
