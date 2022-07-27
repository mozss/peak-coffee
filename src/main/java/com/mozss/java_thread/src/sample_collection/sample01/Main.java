package com.mozss.java_thread.src.sample_collection.sample01;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		new WriterThread(list).start();
		new ReaderThread(list).start();
	}
}
