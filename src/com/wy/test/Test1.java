package com.wy.test;

/**
 * @ClassName: Test1
 * @Author: WangYing
 * @Date: 2021/3/18
 */
public class Test1 {
	public static void main (String[] args) {
		PublicQueue publicQueue = new PublicQueue();
		ProducerThread producerThread = new ProducerThread(publicQueue);
		ConsumerThread consumerThread = new ConsumerThread(publicQueue);
		producerThread.start();//启动生产者线程
		consumerThread.start();//启动消费者线程
	}
}
