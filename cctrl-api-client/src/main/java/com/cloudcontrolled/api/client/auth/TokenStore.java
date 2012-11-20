package com.cloudcontrolled.api.client.auth;

public class TokenStore {

	private String token;
	
	public TokenStore(){
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
