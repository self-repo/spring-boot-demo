package com.opensource.guava.eventbus;

import com.google.common.eventbus.Subscribe;

public class EventListener { // ������

	// @Subscribe��֤����ֻ��һ���������,�������Ҫ����ĳ�����͵���Ϣ,ֻ��Ҫ��ָ���ķ����ϼ���@Subscribeע�⼴��
	@Subscribe
	public void listen(OrderEvent event) {
		System.out.println("receive message: " + event.getMessage());
	}

	/*
	 * һ��subscriberҲ����ͬʱ���Ķ���¼� Guava��ͨ���¼��������Ͷ��ķ������β����������׵���subscriber���ĸ����ķ���
	 */
	@Subscribe
	public void listen(String message) {
		System.out.println("receive message: " + message);
	}
}
