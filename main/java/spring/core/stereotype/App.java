package spring.core.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/core/stereotype/config.xml");
//		Student s1 = context.getBean("student",Student.class);
		Student s1 = context.getBean("st",Student.class);
		System.out.println(s1);
	}

}
