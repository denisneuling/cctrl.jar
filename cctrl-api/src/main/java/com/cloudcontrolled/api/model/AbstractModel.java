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

import java.util.UUID;

/**
 * Superclass of each wrapped response model.
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
public abstract class AbstractModel {

	protected UUID uuid = UUID.randomUUID();

	public UUID getUuid() {
		return uuid;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		AbstractModel other = (AbstractModel) obj;
//		if (uuid == null) {
//			if (other.uuid != null)
//				return false;
//		} else if (!uuid.equals(other.uuid))
//			return false;
//		return true;
//	}
}
