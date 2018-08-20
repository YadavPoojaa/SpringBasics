package org.spring.example.annotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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
	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	@PostConstruct
	public void init() {
		System.out.println("Initializing circle");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroying circle");
	}
}
