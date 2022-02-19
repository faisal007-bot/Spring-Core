package spring.core.autowiring.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/core/autowiring/qualifier/config.xml");
		Student s1 = context.getBean("s1",Student.class);
		System.out.println(s1);
	}
}
