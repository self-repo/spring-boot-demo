package com.utils;

import java.io.IOException;

public class CmdDemo {

	public static void main(String[] args) {

		// D:\eclipse-java\minerva\com.demo.flink
		// cmd /k cd D:\\platform\\feature\\branch1 && mvn package
		String mvnCmd = "cmd /c cd D:\\eclipse-java\\minerva\\com.demo.flink && D:\\apache-maven-3.5.2\\bin\\mvn clean";
		// "cmd /c D:\\apache-maven-3.5.2\\bin\\mvn -version";

		try {
			CmdResult result = CommandUtils.execMvnCmd(mvnCmd);
			System.err.println(result.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
