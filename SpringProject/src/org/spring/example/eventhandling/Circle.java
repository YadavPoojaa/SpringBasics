package org.spring.example.eventhandling;

import javax.annotation.Resource;
import org.spring.example.eventhandling.Point;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware{

	private Point center;
	private ApplicationEventPublisher publisher;
	
	public Point getCenter() {
		return center;
	}
	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Center Point ( "+center.getX()+" , "+center.getY()+" )");
		DrawEvent event = new DrawEvent(this);
		publisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

}
