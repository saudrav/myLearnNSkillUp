package com.cts.model;

public class DrawingApp {
	
	private Shape shape;
	
	public DrawingApp(Shape shape) {
		this.shape = shape;
	}
	
	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void drawShape() {

//		Triangle tr = new Triangle();
//		tr.draw();
		
//		Circle c = new Circle();
//		c.draw();
		
		shape.draw();
		
	}
	
}
