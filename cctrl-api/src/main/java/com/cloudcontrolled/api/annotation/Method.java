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

import com.cloudcontrolled.api.common.HttpMethod;

/**
 * The decorated <strong>{@link com.cloudcontrolled.api.request.Request}
 * type</strong> will be send via the chosen <strong>
 * {@link com.cloudcontrolled.api.common.HttpMethod}</strong>.
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface Method {

	/**
	 * Define the {@link HttpMethod} to use.
	 * 
	 * @return the {@link HttpMethod} to use.
	 */
	HttpMethod value();
}
