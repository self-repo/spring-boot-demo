package com.opensource.guava;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

import javax.annotation.Nullable;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public class ListenableFutureDemo {

	public static void main(String[] args) {
		// ��ExecutorServiceװ�γ�ListeningExecutorService
		ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());

		// ͨ���첽�ķ�ʽ���㷵�ؽ��
		ListenableFuture<String> future = service.submit(() -> {
			System.out.println("call execute..");
			return "task success!";
		});

		// �����ַ�������ִ�д�Future��ִ��Future���֮��Ļص�����
		future.addListener(() -> { // �÷������ڶ��߳��������ʱ��,ָ����Runnable��������Ķ���ᱻָ����Executorִ��
			try {
				System.out.println("result: " + future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}, service);

		Futures.addCallback(future, new FutureCallback<String>() {
			@Override
			public void onSuccess(@Nullable String result) {
				System.out.println("callback result: " + result);
			}

			@Override
			public void onFailure(Throwable t) {
				System.out.println(t.getMessage());
			}
		}, service);
	}

}
