package spring.core.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		if we are configuring without xml we need to use the annotationconfigapplicationcontext class.
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
//		Student s1 = context.getBean("s",Student.class);
//		System.out.println(s1);
//		Test t = context.getBean("getObject",Test.class);
		Test t1 = context.getBean("t1",Test.class);
		Test t2 = context.getBean("t2",Test.class);
		Test t3 = context.getBean("t3",Test.class);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
