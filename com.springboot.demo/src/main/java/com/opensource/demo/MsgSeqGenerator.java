package com.opensource.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.lang.StringUtils;

public class MsgSeqGenerator {

	private static AtomicLong id = new AtomicLong(0);

	private static String moduleId;

	public static void setModuleId(String moduleId) {
		MsgSeqGenerator.moduleId = moduleId;
	}

	public static String getMsgSeq() {
		String msgSeq;
		if (StringUtils.isEmpty(moduleId)) {
			id.compareAndSet(0xFFFFFFFFL, 0);
			long seq = id.incrementAndGet();
			msgSeq = String.format("%08X", seq);
		} else {
			id.compareAndSet(0xFFFFFL, 0);
			long seq = id.incrementAndGet();
			msgSeq = moduleId + String.format("%05X", seq);
		}
		return msgSeq;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(MsgSeqGenerator.getMsgSeq());
		}
	}

}
