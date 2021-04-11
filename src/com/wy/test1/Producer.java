package com.wy.test1;

/**
 * @ClassName: Producer
 * @Author: WangYing
 * @Date: 2021/3/18
 */
public class Producer implements Runnable {
	private Storage storage;
	
	public Producer (Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run () {
		for (int i = 0; i < 20; i++) {
			storage.put();
		}
	}
}
