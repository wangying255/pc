package com.wy.test4;

/**
 * @ClassName: Message
 * @Author: WangYing
 * @Date: 2021/3/18
 */
public class Message {
	private int id;
	private String message;
	
	public Message (int id, String message) {
		this.id = id;
		this.message = message;
	}
	
	
	public int getId () {
		return id;
	}
	
	public String getMessage () {
		return message;
	}
	
	
}
