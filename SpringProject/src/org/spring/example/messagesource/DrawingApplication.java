package org.spring.example.messagesource;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("org/spring/example/messagesource/messagesource.xml");
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		//System.out.println(context.getMessage("greeting", null, "default greeting", null));

	}

}
		