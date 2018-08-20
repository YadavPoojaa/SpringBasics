package org.spring.example.aop.service;

import org.spring.example.aop.model.Circle;
import org.spring.example.aop.model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;
	
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
}
