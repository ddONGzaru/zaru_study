package com.epapyrus.study.designpattern.templatemethod;

public class FruitContainer extends Container {

	@Override
	public String getBody() {
		return "Stainless Body";
	}

	@Override
	public String getCap() {
		return "Stainless Cap";
	}

	@Override
	public String getDivider() {
		return "No Divider";
	}

}
