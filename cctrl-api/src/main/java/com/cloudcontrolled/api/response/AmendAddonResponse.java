package com.cloudcontrolled.api.response;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.model.Addon;
import com.cloudcontrolled.api.response.normalize.AddonNormalizer;

@Normalized(AddonNormalizer.class)
public class AmendAddonResponse extends Response<AmendAddonResponse> {
	private static final long serialVersionUID = 2442480982192274569L;

	private Addon addon;

	public AmendAddonResponse() {
	}

	public Addon getAddon() {
		return addon;
	}

	public void setAddon(Addon addon) {
		this.addon = addon;
	}

	@Override
	public String toString() {
		return (addon != null ? "AmendAddonResponse [addon=" + addon + "]" : super.toString());
	}
}
