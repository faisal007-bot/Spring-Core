package spring.core.si.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/core/si/collection/config.xml");
		Student s = context.getBean("s",Student.class);
		System.out.println(s);
	}
}
