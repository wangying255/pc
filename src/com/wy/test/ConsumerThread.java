package com.wy.test;

/**
 * @ClassName: ConsumerThread
 * @Author: WangYing
 * @Date: 2021/3/18
 */
public class ConsumerThread extends Thread {
	
	private PublicQueue publicQueue;
	
	public ConsumerThread (PublicQueue publicQueue) {
		this.publicQueue = publicQueue;
	}
	
	@Override
	public void run () {
		for (; ; ) {
			publicQueue.remove();
		}
	}
}
