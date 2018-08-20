package org.spring.example.interfacecoding;

public class Circle implements Shape{

	private Point center;
	
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Center Point ( "+center.getX()+" , "+center.getY()+" )");
	}


	public Point getCenter() {
		return center;
	}


	public void setCenter(Point center) {
		this.center = center;
	}

}
