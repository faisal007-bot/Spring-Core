package spring.core.lifecycle.interf;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{
	private int id;

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy method");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init method");
	}

	
}
