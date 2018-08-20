package org.spring.example.lifecycle.callback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A is ("+getPointA().getX()+" , "+getPointA().getY()+" )");
		System.out.println("Point B is ("+getPointB().getX()+" , "+getPointB().getY()+" )");
		System.out.println("Point C is ("+getPointC().getX()+" , "+getPointC().getY()+" )");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean Init method is called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroyable Bean Destroy method is called");
	}
	
	public void myInit(){
		System.out.println("Bean Init method is called");
	}
	
	public void cleanUp() {
		System.out.println("Bean Destroy method is called");
	}
}
