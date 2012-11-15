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
import com.cloudcontrolled.api.model.Addon;
import com.cloudcontrolled.api.response.normalize.ListAddonNormalizer;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Normalized(ListAddonNormalizer.class)
public class ListAddonResponse extends Response<ListAddonResponse> {
	private static final long serialVersionUID = -4524912203807674372L;

	private Addon[] addons;

	public Addon[] getAddons() {
		return addons;
	}

	public void setAddons(Addon[] addons) {
		this.addons = addons;
	}

	public ListAddonResponse() {
	}

	@Override
	public String toString() {
		return (addons != null ? "ListAddonResponse [addon=" + Arrays.toString(addons) + "]" : super.toString());
	}
}
