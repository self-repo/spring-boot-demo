package com.opensource.guava.eventbus;

public class OrderEvent { // �¼�
	private String message;

	public OrderEvent(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
