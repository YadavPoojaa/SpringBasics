package org.spring.example.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		//example for list
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("org/spring/example/list/listexample.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
