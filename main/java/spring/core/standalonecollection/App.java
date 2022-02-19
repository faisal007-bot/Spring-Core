package spring.core.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/core/standalonecollection/config.xml");
		Test t1 = context.getBean("t1",Test.class);
		System.out.println(t1);
		Test t2 = context.getBean("t2",Test.class);
		System.out.println(t2);
	}
}
