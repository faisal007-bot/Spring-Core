package spring.core.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int id;
//	@Autowired
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
	public void setAddress(Address address) {
		this.address = address;
	}
	@Autowired
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
