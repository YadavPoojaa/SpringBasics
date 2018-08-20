package org.spring.example.aop.service;

import org.spring.example.aop.model.Circle;

public class ShapeServiceProxy extends ShapeService {

	@Override
	public Circle getCircle() {
		return super.getCircle();
	}
}
