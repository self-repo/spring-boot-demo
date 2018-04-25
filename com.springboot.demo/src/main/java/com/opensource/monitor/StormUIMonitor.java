package com.opensource.monitor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.utils.HttpClientUtils;

public class StormUIMonitor {

	static final String configurationPath = "/api/v1/cluster/configuration";

	public static void main(String[] args) {
		List<String> clusterUrls = new ArrayList<String>();

		clusterUrls.add("http://newstorm.vip.vip.com");
		clusterUrls.add("http://gd6stormsec.vip.com");
		clusterUrls.add("http://gd6umcstorm.vip.com");

		clusterUrls.add("http://sdrtrsstorm.vip.com");
		clusterUrls.add("http://sdstorm3.vip.com");
		clusterUrls.add("http://sdrtrsstorm7.vip.com");
		clusterUrls.add("http://sdstorm8.vip.com");
		clusterUrls.add("http://sdstorm5.vip.com");
		clusterUrls.add("http://sdstorm1.vip.com");

		clusterUrls.add("http://gd9storm.vip.com");
		clusterUrls.add("http://gd9storm2.vip.com");
		while (true) {
			for (String url : clusterUrls) {
				String result = null;
				try {
					result = HttpClientUtils.getInstance().get(url + "/api/v1/cluster/configuration", 30000);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (result == null || result.contains("html"))
					try {
						HttpClientUtils.getInstance()
								.get("http://vrc.vip.vip.com/data/notification/send-sms?tels=13770967225,13636501780,15900848472&message="
										+ url + "-ui-down", 30000);
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
			try {
				Thread.sleep(60000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
