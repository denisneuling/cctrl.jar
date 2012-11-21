package com.cloudcontrolled.api.client.auth;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
public class TokenStore {

	private String token;

	public TokenStore() {
	}

	/**
	 * 
	 * @return
	 */
	public String getToken() {
		return token;
	}

	/**
	 * 
	 * @param token
	 */
	public void setToken(String token) {
		this.token = token;
	}
}
