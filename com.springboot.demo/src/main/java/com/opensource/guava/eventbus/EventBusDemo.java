package com.opensource.guava.eventbus;

import com.google.common.eventbus.EventBus;

public class EventBusDemo {

	public static void main(String[] args) {
		EventBus eventBus = new EventBus("jack");
		/*
		 * ������subscriber������ͬһ���¼�,��ôÿ��subscriber�����յ��¼�֪ͨ �����յ��¼�֪ͨ��˳���ע���˳�򱣳�һ��
		 */
		eventBus.register(new EventListener()); // ע�ᶩ����
		eventBus.register(new MultiEventListener());

		eventBus.post(new OrderEvent("hello")); // �����¼�
		eventBus.post(new OrderEvent("world"));
		eventBus.post("!");

	}

}
