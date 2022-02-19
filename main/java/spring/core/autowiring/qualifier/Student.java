package spring.core.autowiring.qualifier;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int id;
	
//	@Autowired
//	@Qualifier("a2")
//	@Qualifier("a1")
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
//	@Autowired
//	@Qualifier("a1")
//	@Qualifier("a2")
	public void setAddress(Address address) {
		this.address = address;
	}
//	qualifier annotation is not applicable for constructors
	public Student(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", address=" + address + "]";
	}
	
	
}
