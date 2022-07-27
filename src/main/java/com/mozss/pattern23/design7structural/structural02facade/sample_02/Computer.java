package com.mozss.pattern23.design7structural.structural02facade.sample_02;

public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}
	
	/**
	 * 简单举例, 不考虑实际Cpu, Memory, Disk的开机/关机 顺序
	 */
	public void startUp() {
		System.out.println("计算机启动...");
		cpu.startUp();
		memory.startUp();
		disk.startUp();
		System.out.println("启动成功!!!");
	}
	
	/**
	 * 简单举例, 不考虑实际Cpu, Memory, Disk的开机/关机 顺序
	 */
	public void shutdown() {
		System.out.println("开始关闭计算机---");
		cpu.startUp();
		memory.shutdown();
		disk.shutdown();
		System.out.println("已经关机!!!");
	}
}
