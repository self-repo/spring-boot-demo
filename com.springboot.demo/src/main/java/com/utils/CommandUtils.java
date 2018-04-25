package com.utils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CommandUtils {

	public static CmdResult execMvnCmd(String mvnCmd) throws IOException {
		Process p = Runtime.getRuntime().exec(mvnCmd);
		String exeResult = doInputWrap(p.getInputStream());
		CmdResult result = new CmdResult(mvnCmd);
		result.setResult(exeResult);
		return result;
	}

	private static String doInputWrap(InputStream inputStream) throws IOException {
		BufferedInputStream br = new BufferedInputStream(inputStream);
		int ch;
		StringBuffer text = new StringBuffer();

		while ((ch = br.read()) != -1) {
			text.append((char) ch);
		}
		return text.toString();
	}

}
