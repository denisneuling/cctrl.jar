package com.cloudcontrolled.api.client.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.apache.cxf.jaxrs.client.WebClient;

public class Header {

	public static final String PROPERTIESLOACTION = "header.properties";

	private static Header INSTANCE;

	private Properties header = new Properties();

	private Header() {
	}

	private Properties getHeader() {
		return header;
	}

	private void setHeader(Properties properties) {
		header = properties;
	}

	private void load() throws IOException {
		InputStream inputStream = ClassLoader.getSystemResourceAsStream(PROPERTIESLOACTION);
		Properties properties = new Properties();
		try {
			properties.load(inputStream);
		} catch (IOException ioe) {
			throw ioe;
		} finally {
			inputStream.close();
		}
		setHeader(properties);
	}

	public static Header getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Header();
			try {
				INSTANCE.load();
			} catch (Exception e) {
				INSTANCE.setHeader(new Properties());
			}
		}
		return INSTANCE;
	}

	public static WebClient setHeader(WebClient webClient) {
		Properties properties = getInstance().getHeader();
		Enumeration<Object> keys = properties.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			webClient = webClient.header(key, properties.getProperty((String) key));
		}
		return webClient;
	}
}
