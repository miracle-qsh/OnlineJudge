package com.newoj.bean;

public class SubAndName {
	private Submission sub;
	private String name;
	
	
	public SubAndName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SubAndName(Submission sub, String name) {
		super();
		this.sub = sub;
		this.name = name;
	}
	public Submission getSub() {
		return sub;
	}
	public void setSub(Submission sub) {
		this.sub = sub;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
