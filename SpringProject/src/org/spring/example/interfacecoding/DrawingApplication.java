package org.spring.example.interfacecoding;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("org/spring/example/interfacecoding/interfacecoding.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();

	}

}
