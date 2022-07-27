package com.mozss.pattern23.design5creational.creational05prototype.sample_02.sample_mail;

import java.util.Random;

public class Client {
	//发送账单的数量, 这个值是从数据库中获得的
	private static int MAX_COUNT = 6;
	
	public static void main(String[] args) {
		//模拟发送邮件
		int i = 0;
		//把模板定义出来, 这个是从数据库中获得
		Mail mail = new Mail(new AdTemplate());
		mail.setTail("xx银行版权所有");
		while (i < MAX_COUNT) {
			//以下是每封邮件不同的地方
			mail.setAppellation(getRandString(5) + "先生(女士)");
			mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			sendMail(mail);
			i++;
		}
	}
	
	//发送邮件
	private static void sendMail(Mail mail) {
		System.out.println("标题: " + mail.getSubject() + "\t收件人:" + mail.getReceiver() + "\t...发送成功");
	}
	
	/**
	 * 获得指定长度的随机字符串
	 *
	 * @param maxLength
	 * @return
	 */
	private static String getRandString(int maxLength) {
		String source = "abcdefghijklmnopqrstuvwxyz";
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(random.nextInt(source.length())));
		}
		return sb.toString();
	}
}
