package spring.core.lifecycle.interf;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/core/lifecycle/interf/config.xml");
		context.registerShutdownHook();
		Student s = context.getBean("s",Student.class);
		System.out.println(s);
		context.close();
	}
}
