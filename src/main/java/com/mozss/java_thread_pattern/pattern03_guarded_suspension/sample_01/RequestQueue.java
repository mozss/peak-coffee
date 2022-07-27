package com.mozss.java_thread_pattern.pattern03_guarded_suspension.sample_01;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用于存放请求的RequestQueue
 * <p>
 * 需要注意的点:
 * 1.getRequest和putRequest都是synchronized方法
 * 2.getRequest的开头有一个while语句,用于检查条件是否成立
 * 3.在while语句中执行wait
 * 4.执行完while语句之后,程序才会执行实际想要的处理remove
 * 5.在putRequest中执行notifyAll
 */
public class RequestQueue {
	private final Queue<Request> queue = new LinkedList<Request>();
	
	/**
	 * 取出最先存放的RequestQueue的一个请求
	 *
	 * @return
	 */
	public synchronized Request getRequest() {
		while (queue.peek() == null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		return queue.remove();
	}
	
	/**
	 * 添加一个请求
	 *
	 * @param request
	 */
	public synchronized void putRequest(Request request) {
		queue.offer(request);
		notifyAll();
	}
}
