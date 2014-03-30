package com.epapyrus.study.designpattern.templatemethod;

public class KimChiContainer extends Container {

	@Override
	public String getBody() {
		return "Plastic Body";
	}

	@Override
	public String getCap() {
		return "Plastic Cap";
	}

	@Override
	public String getDivider() {
		return "Simple Divider";
	}

}
