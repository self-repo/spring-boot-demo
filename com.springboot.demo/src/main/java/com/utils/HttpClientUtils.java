package com.utils;

import java.io.IOException;
import java.io.Serializable;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author david03.wang
 *
 */
public class HttpClientUtils implements Serializable {

	private static final long serialVersionUID = -3619545561981052364L;

	private static Logger logger = LoggerFactory.getLogger(HttpClientUtils.class);

	private static final int DEFAULT_TIMEOUT = 30 * 1000;// milliseconds
	private static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 10;
	private static final int DEFAULT_NAX_CONNECTIONS_PER_HOST = 5;

	private CloseableHttpClient httpClient = null;

	private static HttpClientUtils httpClientUtils = new HttpClientUtils(DEFAULT_MAX_TOTAL_CONNECTIONS,
			DEFAULT_NAX_CONNECTIONS_PER_HOST, DEFAULT_TIMEOUT);

	private int maxTotalConnections;

	private int maxConnectionsPerHost;

	private int timeout;

	public static HttpClientUtils getInstance() {
		return httpClientUtils;
	}

	public HttpClientUtils(int maxTotalConnections, int maxConnectionsPerHost, int timeout) {
		try {
			this.maxConnectionsPerHost = maxConnectionsPerHost;
			this.maxTotalConnections = maxTotalConnections;
			PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager();
			poolingHttpClientConnectionManager.setMaxTotal(this.maxTotalConnections); // 连接池最多连接数
			poolingHttpClientConnectionManager.setDefaultMaxPerRoute(this.maxConnectionsPerHost); // 每个域名的最大连接数,

			httpClient = HttpClients.custom().setConnectionManager(poolingHttpClientConnectionManager).build();
			this.timeout = timeout;
		} catch (Throwable e) {
			logger.error("init http client utils error with exception", e);
		}
	}

	public String get(String url) throws IOException {
		return this.get(url, DEFAULT_TIMEOUT);
	}

	public String get(String url, int timeout) throws IOException {
		CloseableHttpResponse response = null;
		String result = null;
		try {
			HttpGet httpGet = new HttpGet(url);
			httpGet.setConfig(requestConfigWithTimeout(timeout));
			response = httpClient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			result = EntityUtils.toString(entity);
		} catch (ClientProtocolException e) {
			logger.error("error while get request with url {}", url, e);
		} catch (IOException e) {
			logger.error("error while get request with url {}", url, e);
		} finally {
			if (response != null) {
				response.close();
			}
		}
		// logger.info("http request with url {} , and the response is {}", url,
		// result);
		return result;
	}

	private RequestConfig requestConfigWithTimeout(int timeoutInMilliseconds) {
		return RequestConfig.copy(RequestConfig.DEFAULT).setSocketTimeout(timeoutInMilliseconds)
				.setConnectTimeout(timeoutInMilliseconds).setConnectionRequestTimeout(timeoutInMilliseconds).build();
	}

	public int getMaxTotalConnections() {
		return maxTotalConnections;
	}

	public void setMaxTotalConnections(int maxTotalConnections) {
		this.maxTotalConnections = maxTotalConnections;
	}

	public int getMaxConnectionsPerHost() {
		return maxConnectionsPerHost;
	}

	public void setMaxConnectionsPerHost(int maxConnectionsPerHost) {
		this.maxConnectionsPerHost = maxConnectionsPerHost;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

}