package spring.core.si.dependentcollection;

import java.util.Map;
//import java.util.List;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private Set<Address> addresses;
	private Map<Address,PhoneNumber> details;
	
	public Map<Address, PhoneNumber> getDetails() {
		return details;
	}
	public void setDetails(Map<Address, PhoneNumber> details) {
		this.details = details;
	}
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
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addresses=" + addresses + ", details=" + details + "]";
	}
	
}
