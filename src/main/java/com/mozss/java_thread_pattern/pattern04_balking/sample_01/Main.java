package com.mozss.java_thread_pattern.pattern04_balking.sample_01;

/**
 * @author
 */
public class Main {
	public static void main(String[] args) {
		//将data.txt存放在sample_01目录下
		Data data = new Data("module_java-thread-pattern/src/main/java/pattern04_balking/sample_01/data.txt",
				"(empty)");
		new ChangerThread("ChangerThread", data).start();
		new SaverThread("SaverThread", data).start();
	}
}
