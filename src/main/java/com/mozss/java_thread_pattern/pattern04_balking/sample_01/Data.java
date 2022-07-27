package com.mozss.java_thread_pattern.pattern04_balking.sample_01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Data {
	//保存的文件名称
	private final String filename;
	//数据内容
	private String content;
	//是否修改,修改后未保存,则为true
	private boolean changed;
	
	public Data(String filename, String content) {
		this.filename = filename;
		this.content = content;
		this.changed = true;
	}
	
	/**
	 * 修改数据内容
	 */
	public synchronized void change(String newContent) {
		content = newContent;
		changed = true;
	}
	
	public synchronized void save() throws IOException {
		if (!changed) {
			return;
		}
		//这里调用了,需要抛出或处理异常
		doSave();
		changed = false;
	}
	
	/**
	 * 将数据内容实际保存到文件中
	 */
	private void doSave() throws IOException {
		System.out.println(Thread.currentThread().getName() + "calls doSave, content = " + content);
		//这里需要抛出IO异常
		Writer writer = new FileWriter(filename);
		writer.write(content);
		writer.close();
	}
}
