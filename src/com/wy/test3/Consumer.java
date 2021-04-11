package com.wy.test3;

/**
 * @ClassName: Consumer
 * @Author: WangYing
 * @Date: 2021/3/11
 */
public class Consumer implements Runnable {
	
	//	private EventStorage storage;
//
//	public Consumer(EventStorage storage){
//		this.storage = storage;
//	}
//
//	@Override
//	public void run () {
//		for (int i = 0; i < 20; i++) {
//		     storage.put();
//		}
//	}
	private EventStorage storage;
	
	public Consumer (EventStorage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run () {
		for (int i = 0; i < 20; i++) {
			storage.take();
		}
	}
}
