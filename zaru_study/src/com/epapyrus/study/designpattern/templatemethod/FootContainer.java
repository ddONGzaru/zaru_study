package com.epapyrus.study.designpattern.templatemethod;

public class FootContainer extends Container {

	@Override
	public String getBody() {
		return "Wood Body";
	}

	@Override
	public String getCap() {
		return "Wood Cap";
	}

	@Override
	public String getDivider() {
		return "Multi Divider";
	}

}
