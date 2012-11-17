package com.cloudcontrolled.api.response;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.model.Addon;
import com.cloudcontrolled.api.response.normalize.AddonNormalizer;

@Normalized(AddonNormalizer.class)
public class AddAddonResponse extends Response<AddAddonResponse> {
	private static final long serialVersionUID = 4186157752700148987L;

	private Addon addon;

	public AddAddonResponse() {
	}

	public Addon getAddon() {
		return addon;
	}

	public void setAddon(Addon addon) {
		this.addon = addon;
	}

	@Override
	public String toString() {
		return (addon != null ? "AddAddonResponse [addon=" + addon + "]" : super.toString());
	}
}
