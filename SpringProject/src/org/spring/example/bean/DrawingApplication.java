package org.spring.example.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("org/spring/example/bean/spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}
