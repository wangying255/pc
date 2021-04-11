package com.wy.test1;

/**
 * @ClassName: TestCp
 * @Author: WangYing
 * @Date: 2021/3/18
 */
public class TestCp {
	
	public static void main (String[] args) {
		Storage storage = new Storage();
		Producer producer = new Producer(storage);
		Consumer consumer = new Consumer(storage);
		
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}
