/*
 * Copyright 2012 Denis Neuling 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package com.cloudcontrolled.api.model;

/**
 * The log object contains the timestamp, the type and the content of your log
 * messages of your installed deployment.
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
public class Log extends AbstractModel {

	private long time;
	private String type;
	private String message;

	/**
	 * <p>
	 * Constructor for Log.
	 * </p>
	 */
	public Log() {
	}

	/**
	 * <p>
	 * Getter for the field <code>time</code>.
	 * </p>
	 *
	 * @return dateTime the datetime when the log entry was produced
	 */
	public long getTime() {
		return time;
	}

	/**
	 * <p>
	 * Setter for the field <code>time</code>.
	 * </p>
	 *
	 * @param time
	 *            the time to set
	 */
	public void setTime(long time) {
		this.time = time;
	}

	/**
	 * <p>
	 * Getter for the field <code>message</code>.
	 * </p>
	 *
	 * @return message the message of the log entry
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <p>
	 * Setter for the field <code>message</code>.
	 * </p>
	 *
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * <p>
	 * Getter for the field <code>type</code>.
	 * </p>
	 *
	 * @return type the type of the log entry
	 */
	public String getType() {
		return type;
	}

	/**
	 * <p>
	 * Setter for the field <code>type</code>.
	 * </p>
	 *
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "Log [time=" + time + ", type=" + type + ", message=" + message + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + (int) (time ^ (time >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Log other = (Log) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (time != other.time)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}
