package org.spring.example.beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("org/spring/example/beaninheritance/beaninheritance.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		//list merge example
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();

	}

}
