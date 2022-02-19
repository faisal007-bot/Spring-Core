package spring.core.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
//	lifecycle methods using annotations
//	@PostConstruct
//	public void init() {
//		System.out.println("init method");
//	}
//	@PreDestroy
//	public void destroy() {
//		System.out.println("destroy method");
//	}
	
//	lifecycle methods using annotations using different name
	@PostConstruct
	public void start() {
		System.out.println("start method");
	}
	@PreDestroy
	public void end() {
		System.out.println("end method");
	}
}
