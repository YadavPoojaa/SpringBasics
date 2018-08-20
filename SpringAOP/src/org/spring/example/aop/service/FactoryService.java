package org.spring.example.aop.service;

import org.spring.example.aop.model.Circle;
import org.spring.example.aop.model.Triangle;

public class FactoryService {

	public Object getBean(String beanType) {
		if(beanType.equals("ShapeService")) {
			return new ShapeServiceProxy();
		}else if(beanType.equals("Triangle")) {
			return new Triangle();
		}else if(beanType.equals("Circle")) {
			return new Circle();
		}
		return null;
	}
}
