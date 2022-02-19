package spring.core.ci.inheritingbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/core/ci/inheritingbean/config.xml");
		Student s1 = context.getBean("s",Student.class);
		Student s2 = context.getBean("s1",Student.class);
		Student s3 = context.getBean("s2",Student.class);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
