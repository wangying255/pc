package com.wy.test1;

/**
 * @ClassName: Consumer
 * @Author: WangYing
 * @Date: 2021/3/18
 */
public class Consumer implements Runnable {
	
	private Storage storage;

	public Consumer (Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run () {
		for (int i = 0; i < 20; i++) {
			storage.take();
		}
	}
}
