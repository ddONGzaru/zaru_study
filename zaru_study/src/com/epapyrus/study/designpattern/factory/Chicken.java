package com.epapyrus.study.designpattern.factory;

public abstract class Chicken {

	private String name;
	
	private String source;

	public String getName() {
		return name;
	}
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void prepare() {
		System.out.println("욕쟁이 할머니가 준비해 주신 싱시한 생육 준비 완료!");
	}
	
	public void deepFry() {
		System.out.println("지글지글 자글자글 지글지글 자글자글... 치킨이 튀겨졌네요.");
	}
	
	public void pourSource() {
		System.out.println(this.source + "가 왼손에 의해 두 번 오른손에 의해 두 번 저어집니다.\n");
		System.out.println("소스를 적당한 온도로 덥힌 후 튀긴 치킨 위에 천천히 부어줍니다.");
	}	
}
