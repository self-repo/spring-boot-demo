package com.utils;

public class CmdResult {

	private String cmd;
	private String result;
	private String exception;

	public CmdResult() {

	}

	public CmdResult(String cmd) {
		this.cmd = cmd;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	@Override
	public String toString() {
		return "CmdResult [cmd=" + cmd + ", result=" + result + ", exception=" + exception + "]";
	}

}
