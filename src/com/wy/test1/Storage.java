package com.wy.test1;

import java.util.Date;
import java.util.LinkedList;

/**
 * @ClassName: Stroage
 * @Author: WangYing
 * @Date: 2021/3/18
 */
public class Storage {

	private int maxSize;
	private LinkedList<Date> storage;
	
	public Storage () {
		maxSize = 15;
		storage = new LinkedList<>();
	}
	
	public synchronized void put () {
		while (storage.size() == maxSize) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		storage.add(new Date());
		System.out.println("仓库有" + storage.size());
		notify();
	}
	
	
	public synchronized void take () {
		while (storage.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("消费了" + storage.poll() + "还剩" + storage.size());
		notify();
	}
	
	
}
