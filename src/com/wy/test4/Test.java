package com.wy.test4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;

/**
 * @ClassName: Test
 * @Author: WangYing
 * @Date: 2021/3/18
 */
public class Test {
	/*
	public static void main (String[] args) {
		MessageQueue queue = new MessageQueue();//初始队列容量为2
		for (int i = 0; i < 6; i++) {//生产编号0-4的消息，生产线程
			int id = i;
			new Thread(()->{
				queue.producer(new Message(id,"message:"+id));//调用生产方法
			}, "producer :"+i).start();//每个消息对应一个线程启动
		}
		
		new Thread(()->{//消费线程
			while (true){//一直消费直至队列为空
				try {
					Thread.sleep(1000);
					queue.consumer();//调用消费方法
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "consumer").start();//线程启动
		
	}
	
	 */
	
	public static void main (String[] args) {
		MessageQueue queue = new MessageQueue();
		for (int i = 0; i < 10; i++) {
			int id = i;
			new Thread(() -> {
				queue.producer(new Message(id, "消息" + id));
			}, "producer" + i).start();
		}
		new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(1000);
					queue.consumer();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					
					Date date = new Date();
					new ArrayList<>();
					
				}
			}
		}, "consumer").start();
	}
	
	
	
	
}
