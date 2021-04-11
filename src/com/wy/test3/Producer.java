package com.wy.test3;

/**
 * @ClassName: Producer
 * @Author: WangYing
 * @Date: 2021/3/11
 */
public class Producer implements Runnable {
	//	    private  EventStorage storage;
//
//	    public Producer(EventStorage storage){
//	    	this.storage = storage;
//		}
//
//	@Override
//	public void run () {
//		for (int i = 0; i < 20; i++) {
//			storage.take();
//		}
//	}
	private EventStorage storage;
	
	public Producer (EventStorage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run () {
		for (int i = 0; i < 20; i++) {
			storage.put();
		}
	}

}
