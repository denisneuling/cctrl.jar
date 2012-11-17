package com.cloudcontrolled.api.response;

import java.util.Arrays;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.model.AddonAnonymous;
import com.cloudcontrolled.api.response.normalize.ListAddonNormalizer;

@Normalized(ListAddonNormalizer.class)
public class ListAddonAnonymousResponse extends Response<ListAddonAnonymousResponse> {
	private static final long serialVersionUID = 7659357669449771246L;

	private AddonAnonymous[] addons;

	public ListAddonAnonymousResponse() {
	}

	public AddonAnonymous[] getAddons() {
		return addons;
	}

	public void setAddons(AddonAnonymous[] addons) {
		this.addons = addons;
	}

	@Override
	public String toString() {
		return (addons != null ? "ListAddonAnonymousResponse [addons=" + Arrays.toString(addons) + "]" : super.toString());
	}
}
