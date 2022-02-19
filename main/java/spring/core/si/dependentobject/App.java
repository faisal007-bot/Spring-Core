package spring.core.si.dependentobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/core/si/dependentobject/config.xml");
		Student s = context.getBean("s1",Student.class);
		System.out.println(s);
	}
}
