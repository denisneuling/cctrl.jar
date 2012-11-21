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
package com.cloudcontrolled.api.client.util;

import java.util.Date;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
public class Timer {

	private Date start;
	private long difference = 0;

	/**
	 * 
	 * @return
	 */
	public static Timer tic() {
		Timer timer = new Timer();
		timer.start = new Date();
		return timer;
	}

	/**
	 * 
	 * @return
	 */
	public long toc() {
		Date end = new Date();
		difference = end.getTime() - start.getTime();

		return difference;
	}

	/**
	 * 
	 * @return
	 */
	public long getDifference() {
		return difference;
	}
}