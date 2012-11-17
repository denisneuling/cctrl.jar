package com.cloudcontrolled.api.model;

import java.util.Arrays;

public class AddonAnonymous extends AbstractModel {

	private String name;
	private String stage;
	private AddonOption[] options;

	public AddonAnonymous() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public AddonOption[] getOptions() {
		return options;
	}

	public void setOptions(AddonOption[] options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return "AddonAnonymous [name=" + name + ", stage=" + stage + ", options=" + (options != null ? Arrays.toString(options) : "[]") + "]";
	}
}
