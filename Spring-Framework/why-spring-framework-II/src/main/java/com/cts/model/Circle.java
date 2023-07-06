package com.cts.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Circle implements Shape, InitializingBean, DisposableBean{
	
	public void draw() {
		System.out.println("Circle drawn");
	}
	
	public void init() {
		System.out.println("Circle bean just started ");
	}
	
	public void tearDown() {
		System.out.println("Circle bean just going to destroy");
	}

	public void start() {
		System.out.println("Circle::Init method executed");
	}
	
	public void stop() {
		System.out.println("Circle::Tear down method executed");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Circle.destroy() method overriding DisposableBean Interface");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Circle.afterPropertiesSet() method overriding InitializingBean Interface");
	}
}
