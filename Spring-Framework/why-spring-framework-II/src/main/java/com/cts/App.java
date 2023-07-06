package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Circle;
import com.cts.model.DrawingApp;
import com.cts.model.Shape;
import com.cts.model.Triangle;
import com.cts.model.Triangle2;

public class App 
{
    public static void main( String[] args )
    {
		/*
		 * //Loose-coupling by help of Interface 'Shape' and Explicitly dependency
		 * Injection
		 * 
		 * //Shape s = new Triangle(); Shape s = new Circle();
		 * 
		 * DrawingApp app = new DrawingApp(s); //Constructor-Injection
		 * 
		 * //app.setShape(s); // Setter-Injection
		 * 
		 * app.drawShape();
		 */
    	

    	//ApplicationContext cx = new ClassPathXmlApplicationContext("spring.xml");
    	
    	AbstractApplicationContext cx = new ClassPathXmlApplicationContext("spring.xml");
    	cx.registerShutdownHook();
    	
    	Shape t = cx.getBean("triangle", Triangle2.class);
    	Shape c = cx.getBean("circle", Circle.class);
    	//System.out.println();
    	t.draw();
    	c.draw();
    }
}
