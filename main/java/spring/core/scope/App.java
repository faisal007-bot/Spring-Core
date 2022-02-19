package spring.core.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/core/scope/config.xml");
		
//		using xml singleton scope
		Student s1 = context.getBean("s",Student.class);
		Student s2 = context.getBean("s",Student.class);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
//		using xml prototype scope
		Student s3 = context.getBean("s1",Student.class);
		Student s4 = context.getBean("s1",Student.class);
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
//		using scope annotation singleton scope and prototype scope
		Test t1 = context.getBean("test",Test.class);
		Test t2 = context.getBean("test",Test.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
	}
}
