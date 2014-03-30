package com.epapyrus.study.designpattern.templatemethod;

public abstract class Container {
	
	public abstract String getBody();
	public abstract String getCap();
	public abstract String getDivider();
	
	public final String getContainer() {		
		return "몸체: " + getBody() + "\n뚜껑: " + getCap() + "\n디바이더: " + getDivider() + "\n";
	}

}
