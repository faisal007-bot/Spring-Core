package spring.core.withoutxml;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//configuration annotation is used to declare the class as an configuration class
@Configuration
//if we are using component then we need to use the componentscan in which we need to provide the base package to scan
//if we are not using component then we dont need to use the componentscan in which we need to provide the base package to scan
//for using bean annotation we doesnt need to use componentscan and component
//@ComponentScan(basePackages = "spring.core.withoutxml")
public class JavaConfig {
//	bean annotation creates the bean object of the class and the name of the class will be method name
//	if we provide the name explicitly inside the bean annotation then bean will be created using this name
//	it takes array of strings
//	we can use any of the name to get the bean object only one object will be created and multiple references refers to that
//	object
	@Bean({"t1","t2","t3"})
	public Test getObject() {
		Test t = new Test();
		return t;
	}
}
