package spring.core.lifecycle.xml;

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
	
//	lifecycle methods with default names
//	public void init() {
//		System.out.println("init method");
//	}
//	public void destroy() {	
//		System.out.println("destroy method");
//	}
	
//	lifecycle methods with different names
	public void begin() {
		System.out.println("start method");
	}
	public void end() {
		System.out.println("end method");
	}
}
