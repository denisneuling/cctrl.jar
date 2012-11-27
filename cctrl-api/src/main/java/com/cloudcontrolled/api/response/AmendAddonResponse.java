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
package com.cloudcontrolled.api.response;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.model.Addon;
import com.cloudcontrolled.api.response.normalize.AddonNormalizer;

/**
 * <p>
 * AmendAddonResponse class.
 * </p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
@Normalized(AddonNormalizer.class)
public class AmendAddonResponse extends Response<AmendAddonResponse> {
	private static final long serialVersionUID = 2442480982192274569L;

	private Addon addon;

	/**
	 * <p>
	 * Constructor for AmendAddonResponse.
	 * </p>
	 */
	public AmendAddonResponse() {
	}

	/**
	 * <p>
	 * Getter for the field <code>addon</code>.
	 * </p>
	 *
	 * @return a {@link com.cloudcontrolled.api.model.Addon} object.
	 */
	public Addon getAddon() {
		return addon;
	}

	/**
	 * <p>
	 * Setter for the field <code>addon</code>.
	 * </p>
	 *
	 * @param addon
	 *            a {@link com.cloudcontrolled.api.model.Addon} object.
	 */
	public void setAddon(Addon addon) {
		this.addon = addon;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (addon != null ? "AmendAddonResponse [addon=" + addon + "]" : super.toString());
	}
}
