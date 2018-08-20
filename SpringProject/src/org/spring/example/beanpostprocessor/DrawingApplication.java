package org.spring.example.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("org/spring/example/beanpostprocessor/beanpostprocessor.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}
