package com.wy.test;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @ClassName: PublicQueue
 * @Author: WangYing
 * @Date: 2021/3/18
 */
public class PublicQueue<T> {
	
	private BlockingDeque<T> blockingDeque = new LinkedBlockingDeque<>(50);//缓冲区
	
	public void add (T msg) {
		
		try {
			blockingDeque.put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("生产一个产品，当前商品角标为：" + "===文本为：" + msg);
	}
	
	public T remove () {
		
		T t = null;
		try {
			t = blockingDeque.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("消费一个产品，当前商品角标为：" + "===文本为：" + t);
		return t;
	}
}
