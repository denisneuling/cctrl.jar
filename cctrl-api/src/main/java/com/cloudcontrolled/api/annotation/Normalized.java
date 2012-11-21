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
package com.cloudcontrolled.api.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.cloudcontrolled.api.model.AbstractModel;
import com.cloudcontrolled.api.response.Response;
import com.cloudcontrolled.api.response.normalize.JSONNormalizer;

/**
 * The decorated <strong>{@link Response} type</strong> will be built via the
 * defined <strong>{@link JSONNormalizer}</strong>.
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface Normalized {

	/**
	 * The Normalizer which prepares the mapping of the http response into the
	 * concerning {@link AbstractModel}/{@link Response}
	 * 
	 * @return the concerning JSONNormalizer default {@link JSONNormalizer}
	 */
	Class<? extends JSONNormalizer> value() default JSONNormalizer.class;

}
