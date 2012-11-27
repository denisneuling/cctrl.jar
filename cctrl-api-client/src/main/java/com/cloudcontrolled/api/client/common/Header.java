package com.cloudcontrolled.api.client.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.apache.cxf.jaxrs.client.WebClient;

/**
 * <p>
 * Header class.
 * </p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 * @since 0.1.1
 */
public class Header {

	/** Constant <code>PROPERTIESLOACTION="header.properties"</code> */
	public static final String PROPERTIESLOACTION = "header.properties";

	private static Header INSTANCE;

	private Properties header = new Properties();

	private Header() {
	}

	/**
	 * 
	 * @return
	 */
	private Properties getHeader() {
		return header;
	}

	/**
	 * 
	 * @param properties
	 */
	private void setHeader(Properties properties) {
		header = properties;
	}

	/**
	 * 
	 * @throws IOException
	 */
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

	/**
	 * <p>
	 * getInstance.
	 * </p>
	 *
	 * @return a {@link com.cloudcontrolled.api.client.common.Header} object.
	 */
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

	/**
	 * <p>
	 * Setter for the field <code>header</code>.
	 * </p>
	 *
	 * @param webClient
	 *            a {@link org.apache.cxf.jaxrs.client.WebClient} object.
	 * @return a {@link org.apache.cxf.jaxrs.client.WebClient} object.
	 */
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
