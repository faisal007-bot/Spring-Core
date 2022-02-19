package spring.core.ci.dependentcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/core/ci/dependentcollection/config.xml");
		Student s = context.getBean("s",Student.class);
		System.out.println(s);
	}
}
