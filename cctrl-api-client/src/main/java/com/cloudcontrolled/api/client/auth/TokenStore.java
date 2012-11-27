package com.cloudcontrolled.api.client.auth;

/**
 * <p>
 * TokenStore class.
 * </p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
public class TokenStore {

	private String token;

	/**
	 * <p>
	 * Constructor for TokenStore.
	 * </p>
	 */
	public TokenStore() {
	}

	/**
	 * <p>
	 * Getter for the field <code>token</code>.
	 * </p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getToken() {
		return token;
	}

	/**
	 * <p>
	 * Setter for the field <code>token</code>.
	 * </p>
	 *
	 * @param token
	 *            a {@link java.lang.String} object.
	 */
	public void setToken(String token) {
		this.token = token;
	}
}
