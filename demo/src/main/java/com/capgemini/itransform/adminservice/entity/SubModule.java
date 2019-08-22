package com.capgemini.itransform.adminservice.entity;

public class SubModule {

	private String subtitle;
	private String subdescription;

	public SubModule(String subtitle, String subdescription) {
		super();
		this.subtitle = subtitle;
		this.subdescription = subdescription;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getSubdescription() {
		return subdescription;
	}

	public void setSubdescription(String subdescription) {
		this.subdescription = subdescription;
	}

}
