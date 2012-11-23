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

import java.util.Arrays;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.model.AddonAnonymous;
import com.cloudcontrolled.api.response.normalize.ListAddonNormalizer;

/**
 * <p>
 * ListAddonAnonymousResponse class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Normalized(ListAddonNormalizer.class)
public class ListAddonAnonymousResponse extends Response<ListAddonAnonymousResponse> {
	private static final long serialVersionUID = 7659357669449771246L;

	private AddonAnonymous[] addons;

	/**
	 * <p>
	 * Constructor for ListAddonAnonymousResponse.
	 * </p>
	 */
	public ListAddonAnonymousResponse() {
	}

	/**
	 * <p>
	 * Getter for the field <code>addons</code>.
	 * </p>
	 * 
	 * @return an array of {@link com.cloudcontrolled.api.model.AddonAnonymous}
	 *         objects.
	 */
	public AddonAnonymous[] getAddons() {
		return addons;
	}

	/**
	 * <p>
	 * Setter for the field <code>addons</code>.
	 * </p>
	 * 
	 * @param addons
	 *            an array of
	 *            {@link com.cloudcontrolled.api.model.AddonAnonymous} objects.
	 */
	public void setAddons(AddonAnonymous[] addons) {
		this.addons = addons;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (addons != null ? "ListAddonAnonymousResponse [addons=" + Arrays.toString(addons) + "]" : super.toString());
	}
}
