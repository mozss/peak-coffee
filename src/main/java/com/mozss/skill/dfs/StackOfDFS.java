package com.mozss.skill.dfs;

/**
 * 这里提供DFS的伪代码
 */
public class StackOfDFS {
	/*
	方式一:递归方式实现DFS
	缺点: 如果递归的深度太高, 可能会堆栈移除
	// Return true if there is a path from cur to target.
	boolean DFS(Node cur, Node target, Set<Node> visited) {
		return true if cur is target;
		for (next : each neighbor of cur) {
			if (next is not in visited) {
				add next to visted;
				return true if DFS(next, target, visited) == true;
			}
		}
		return false;
	}
	*/
	
	/*
	*
	* 方式二: 显示栈
	* 与递归解决方案的逻辑相同,但使用while循环和栈来模拟递归期间的系统调用栈
	boolean DFS(int root, int target) {
		Set<Node> visited;
		Stack<Node> s;
		add root to s;
		while (s is not empty) {
			Node cur = the top element in s;
			return true if cur is target;
			for (Node next : the neighbors of cur) {
				if (next is not in visited) {
					add next to s;
					add next to visited;
				}
			}
			remove cur from s;
		}
		return false;
	}
	*
	* */
}
