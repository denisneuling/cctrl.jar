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
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
public class Version extends AbstractModel {

	private String pycclib;
	private String cctrl;

	public Version() {
	}

	/**
	 * 
	 * @return
	 */
	public String getPycclib() {
		return pycclib;
	}

	/**
	 * 
	 * @param pycclib
	 */
	public void setPycclib(String pycclib) {
		this.pycclib = pycclib;
	}

	/**
	 * 
	 * @return
	 */
	public String getCctrl() {
		return cctrl;
	}

	/**
	 * 
	 * @param cctrl
	 */
	public void setCctrl(String cctrl) {
		this.cctrl = cctrl;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Version [pycclib=" + pycclib + ", cctrl=" + cctrl + "]";
	}
}
