package com.wy.test;

/**
 * @ClassName: ProducerThread
 * @Author: WangYing
 * @Date: 2021/3/18
 */
public class ProducerThread extends Thread {
	
	private PublicQueue publicQueue;
	
	public ProducerThread (PublicQueue publicQueue) {
		this.publicQueue = publicQueue;
	}
	
	@Override
	public void run () {
		for (int i = 0; i < 60; i++) {
			publicQueue.add(String.valueOf(i));
		}
	}
}

