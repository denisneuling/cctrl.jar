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
 * The version object contains informations about the latest available software
 * to access the cloudCOntrol API.
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
public class Version extends AbstractModel {

	private String pycclib;
	private String cctrl;

	/**
	 * <p>Constructor for Version.</p>
	 */
	public Version() {
	}

	/**
	 * <p>Getter for the field <code>pycclib</code>.</p>
	 *
	 * @return pycclib the latest pycclib release version
	 */
	public String getPycclib() {
		return pycclib;
	}

	/**
	 * <p>Setter for the field <code>pycclib</code>.</p>
	 *
	 * @param pycclib the latest pycclib release version
	 */
	public void setPycclib(String pycclib) {
		this.pycclib = pycclib;
	}

	/**
	 * <p>Getter for the field <code>cctrl</code>.</p>
	 *
	 * @return cctrl the latest cctrl release version
	 */
	public String getCctrl() {
		return cctrl;
	}

	/**
	 * <p>Setter for the field <code>cctrl</code>.</p>
	 *
	 * @param cctrl the latest cctrl release version to set
	 */
	public void setCctrl(String cctrl) {
		this.cctrl = cctrl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "Version [pycclib=" + pycclib + ", cctrl=" + cctrl + "]";
	}
}
