package com.wy.test3;

import java.util.Date;
import java.util.LinkedList;

/**
 * @ClassName: EventStorage
 * @Author: WangYing
 * @Date: 2021/3/11
 */
public class EventStorage {
	
	private int maxSize;
	private LinkedList<Date> storage;
	
	public EventStorage () {
		maxSize = 10;
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
		System.out.println("仓库有" + storage.size() + "个");
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
		System.out.println("消费了" + storage.poll() + ",还剩" + storage.size());
		notify();
	}
	
}
