package com.epapyrus.study.designpattern.factory;

import com.epapyrus.study.designpattern.templatemethod.Container;
import com.epapyrus.study.designpattern.templatemethod.FootContainer;
import com.epapyrus.study.designpattern.templatemethod.FruitContainer;
import com.epapyrus.study.designpattern.templatemethod.KimChiContainer;

public class Executor {

	public static void main(String[] args) {
		
		Container container = new KimChiContainer();
		System.out.println(container.getContainer());
		
		container = new FruitContainer();
		System.out.println(container.getContainer());

		container = new FootContainer();
		System.out.println(container.getContainer());		
	}
	
}
