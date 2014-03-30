package com.epapyrus.study.designpattern.templatemethod;

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
