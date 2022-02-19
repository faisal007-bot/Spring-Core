package spring.core.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/core/autowiring/annotation/config.xml");
//		Student s1 = context.getBean("s1",Student.class);
//		System.out.println(s1);
		Student s2 = context.getBean("s2",Student.class);
		System.out.println(s2);
	}

}
