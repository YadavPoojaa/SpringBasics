package org.spring.example.aop;

import org.spring.example.aop.model.Circle;
import org.spring.example.aop.service.FactoryService;
import org.spring.example.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = context.getBean(ShapeService.class);*/
		//shapeService.getCircle().setName("new Circle");
		//shapeService.getCircle().setNameAndReturn("return circle name");
		//System.out.println(shapeService.getCircle().getName());
		
		FactoryService service = new FactoryService();
		ShapeService shapeService = (ShapeService) service.getBean("ShapeService");
		shapeService.setCircle(new Circle());
		shapeService.getCircle().setName("circle");
	}
}
