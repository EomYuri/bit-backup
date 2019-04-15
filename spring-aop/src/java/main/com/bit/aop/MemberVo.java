package com.bit.aop;

public class MemberVo {
	private String name;

	public MemberVo(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberVo [name=" + name + "]";
	}
	
	
}
