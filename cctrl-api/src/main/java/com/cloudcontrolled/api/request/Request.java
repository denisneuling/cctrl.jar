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
package com.cloudcontrolled.api.request;

import java.io.Serializable;

/**
 * Abstract request class which binds the concerning response to it.
 * 
 * Or for reference have a look here: <a href="https://api.cloudcontrol.com/doc/#top">https://api.cloudcontrol.com/doc/#top</a>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 * @param <Response>
 */
public abstract class Request<Response> implements Serializable {
	private static final long serialVersionUID = -7249502306037443380L;

}
