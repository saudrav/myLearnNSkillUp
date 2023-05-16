package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.controller.DrawingApp;
import com.cts.model.Circle;
import com.cts.model.Triangle;
import com.cts.model.Triangle2;
import com.cts.service.Shape;

public class App 
{
    public static void main( String[] args )
    {
		
		//Loose-coupling by help of Interface 'Shape' and Explicit dependency Injection
		  
		Shape s = new Triangle();    	
    	//Shape s = new Circle();
		
		/* Setter - Injection */
		DrawingApp app = new DrawingApp();
		app.setShape(s); 								// Setter-Injection		  
		app.drawShape();		 

		/* Constructor - Injection */
		DrawingApp app2 = new DrawingApp(s); 			//Constructor-Injection
		app2.drawShape();
    	

    	ApplicationContext cx = new ClassPathXmlApplicationContext("spring.xml");
    	
//    	AbstractApplicationContext cx = new ClassPathXmlApplicationContext("spring.xml");
//    	cx.registerShutdownHook();
    	
    	Shape t = cx.getBean("tr", Triangle.class);
    	Shape c = (Shape) cx.getBean("circle");
    	
    	t.draw();
    	c.draw();
    }
}
