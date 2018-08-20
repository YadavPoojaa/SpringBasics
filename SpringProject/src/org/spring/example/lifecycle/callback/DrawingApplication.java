package org.spring.example.lifecycle.callback;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("org/spring/example/lifecycle/callback/lifecycle.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}
