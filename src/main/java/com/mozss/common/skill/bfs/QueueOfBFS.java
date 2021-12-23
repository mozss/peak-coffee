package com.mozss.common.skill.bfs;

import java.util.Queue;

/**
 * 这里提供BFS的伪代码模板
 */
public class QueueOfBFS {
	
	private class Node{
		//这里省略Node的定义
	}
	
	/**
	 * 返回根节点和目标节点的最短路径
	 * @param root
	 * @param target
	 * @return
	 */
/*	以下是伪代码的模板1:
	int BFS(Node root, Node target){
		//存储所有等待被处理的节点
		Queue<Node> queue;
		int step = 0;
		//1.初始化
		//add root to queue;
		//2.BFS
		while(queue is not empty){
			step = step + 1;
			//迭代已经在队列中的节点
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Node cur = the first node in queue;
				return step if cur is target;
				for (Node next :
						the neighbors of cur) {
					and next to queue;
				}
				remove the first node from queue;
			}
		}
		return -1;
	}*/
	
	/*
	* 有时候, 我们需要去确保不会去访问一个结点两次, 否则我们会陷入死循环.
	* 如果是这样的, 我们需要在上面的代码添加一个哈希集来解决这个问题.
	
	int BFS(Node root, Node target) {
		Queue<Node> queue;  // store all nodes which are waiting to be processed
		Set<Node> used;     // store all the used nodes
		int step = 0;       // number of steps neeeded from root to current node
		// initialize
		add root to queue;
		add root to used;
		// BFS
		while (queue is not empty) {
			step = step + 1;
			// iterate the nodes which are already in the queue
			int size = queue.size();
			for (int i = 0; i < size; ++i) {
				Node cur = the first node in queue;
				return step if cur is target;
				for (Node next : the neighbors of cur) {
					if (next is not in used) {
						add next to queue;
						add next to used;
					}
				}
				remove the first node from queue;
			}
		}
		return -1;          // there is no path from root to target
	}
	*/
}
