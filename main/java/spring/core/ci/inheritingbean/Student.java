package spring.core.ci.inheritingbean;

public class Student {
	private int id;
	private String name;
	private String city;
	
	public Student(int id) {
		super();
		this.id = id;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
