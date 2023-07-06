package com.cts.model;

public class Triangle implements Shape {
	
	private String type;
	private int height;
	
	public Triangle() {
		
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println(type+" Triangle drawn with height of "+height);
	}

}
