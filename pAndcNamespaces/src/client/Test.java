package client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;


public class Test {

	public static void main(String[] args) {
	

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println("after loading xml");
		Car c = (Car)ap.getBean("car");
		System.out.println(c.getPrice());
		System.out.println(c.getEngine().getModel());
		  
		
	}

}
