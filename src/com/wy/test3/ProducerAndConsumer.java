package com.wy.test3;

/**
 * @ClassName: ProducerAndConsumer
 * @Author: WangYing
 * @Date: 2021/3/11
 */
public class ProducerAndConsumer {
//	public static void main (String[] args) {
//
//		EventStorage eventStorage = new EventStorage();
//
//		Producer producer = new Producer(eventStorage);
//		Consumer consumer = new Consumer(eventStorage);
//
//
//		new Thread(producer).start();
//		new Thread(consumer).start();
//	}
	
	public static void main (String[] args) {
		EventStorage eventStorage = new EventStorage();
		Producer producer = new Producer(eventStorage);
		Consumer consumer = new Consumer(eventStorage);
		
		new Thread(producer).start();
		new Thread(consumer).start();
	}

}
