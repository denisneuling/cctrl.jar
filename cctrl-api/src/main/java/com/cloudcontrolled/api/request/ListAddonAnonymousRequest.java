package com.cloudcontrolled.api.request;

import com.cloudcontrolled.api.annotation.Method;
import com.cloudcontrolled.api.annotation.Path;
import com.cloudcontrolled.api.common.HttpMethod;
import com.cloudcontrolled.api.response.ListAddonAnonymousResponse;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Method(HttpMethod.GET)
@Path("/addon/")
public class ListAddonAnonymousRequest extends Request<ListAddonAnonymousResponse> {
	private static final long serialVersionUID = -3214825449312810689L;

	public ListAddonAnonymousRequest() {
	}

}
