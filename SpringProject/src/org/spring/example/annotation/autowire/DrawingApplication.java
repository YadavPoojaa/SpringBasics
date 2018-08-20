package org.spring.example.annotation.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("org/spring/example/annotation/autowire/autowireannotation.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}

}
