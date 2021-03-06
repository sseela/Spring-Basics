package client;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Car;

public class Test {

	public static void main(String[] args) {
	
		// two kinds of DI - setter DI, constructor DI
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		// If we use j2ee container, then as soon as xml is loaded, ApplicationContext will create instanstantiation of singleton beans and inject the dependencies
		System.out.println("after loading xml");
		Car c = (Car)ap.getBean("car");
		System.out.println(c.getPrice());
		System.out.println(c.getEngine().getModel());
		System.out.println(c.getCarList());
		System.out.println(c.getEngineSet());
		System.out.println(c.getCarMap());
		
		
	}

}
