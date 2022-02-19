package spring.core.lifecycle.xml;

public class Employee {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
//	lifecycle methods of spring 
//	public void init() {
//		System.out.println("init method");
//	}
//	
//	public void destroy() {
//		System.out.println("destroy method");
//	}
	
//	lifecycle methods of spring
	public void start() {
		System.out.println("init method with other name");
	}
	public void end() {
		System.out.println("destroy method with othername");
	}
}
