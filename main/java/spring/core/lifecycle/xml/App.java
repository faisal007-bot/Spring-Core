package spring.core.lifecycle.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/core/lifecycle/xml/config.xml");
		context.registerShutdownHook();
		Employee e = context.getBean("e",Employee.class);
		System.out.println(e);
		context.close();
	}
}
