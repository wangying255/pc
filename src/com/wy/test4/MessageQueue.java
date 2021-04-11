package com.wy.test4;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: MessageQueue
 * @Author: WangYing
 * @Date: 2021/3/18
 */
public class MessageQueue {
	
	/*
	private static LinkedList<Message> list = new LinkedList<>();
	private int capacity = 5;
	
	//生产消息
	public void producer (Message message) {
		synchronized (list) {
			while (list.size() == capacity) {
				try {
					System.out.println("队列已满，生产者等待");
					list.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			list.add(message);
			list.notifyAll();
			System.out.println("生产消息：" + message.getMessage() + ",id:" + message.getId());
		}
	}
	
	//消费消息
	public void consumer () {
		synchronized (list) {
			while (list.isEmpty()) {
				try {
					System.out.println("队列已空，消费线程等待");
					list.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Message remove = list.remove();
			System.out.println("消费了：" + remove.getMessage() + "id :" + remove.getId());
			list.notifyAll();
		}
	}
	
	 */
	
	
	private static LinkedList<Message> linkedList = new LinkedList<>();
	private int capacity = 6;
	
	
	//生产者
	
	public void producer (Message message) {
		synchronized (linkedList) {
			while (linkedList.size() == capacity) {
				try {
					System.out.println("队列已满，生产者等待");
					linkedList.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			linkedList.add(message);
			System.out.println("生产了" + message.getMessage() + ",id:" + message.getId());
			linkedList.notifyAll();
		}
	}
	
	public void consumer () {
		synchronized (linkedList) {
			while (linkedList.isEmpty()) {
				
				try {
					System.out.println("队列已空，消费者等待");
					linkedList.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Message removeMessage = linkedList.remove();
			System.out.println("消费了" + removeMessage.getMessage() + "id:" + removeMessage.getId());
			linkedList.notifyAll();
		}
		
		
	}
}
	

	

