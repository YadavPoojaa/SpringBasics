package org.spring.example.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		//example for alias, inner beans and refid
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("org/spring/example/autowiring/autowiringexample.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
