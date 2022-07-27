package com.mozss.pattern23.design5creational.creational03builder.sample_03;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SenderImplMailSender());
			list.get(i).Send(i);
		}
	}
	
	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SenderImplSmsSender());
			list.get(i).Send(i);
		}
	}
}
