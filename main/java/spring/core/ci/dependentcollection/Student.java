package spring.core.ci.dependentcollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private List<Address> addresses;
	private Set<PhoneNumber> numbers;
	private Map<PhoneNumber,Address> records;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, List<Address> addresses, Set<PhoneNumber> numbers,
			Map<PhoneNumber, Address> records) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = addresses;
		this.numbers = numbers;
		this.records = records;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addresses=" + addresses + ", numbers=" + numbers
				+ ", records=" + records + "]";
	}
	
	
}
