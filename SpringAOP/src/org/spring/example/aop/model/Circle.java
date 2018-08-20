package org.spring.example.aop.model;

import org.spring.example.aop.aspect.Loggable;

public class Circle {
	private String name;

	@Loggable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("circle setter is called : "+name);
		this.name = name;
	}
	
	public String setNameAndReturn(String name) {
		System.out.println("circle setter is called : "+name);
		this.name = name;
		return name;
	}
}
