package spring.core.ci.dependentobject;

public class Address {
	private String city;
	private String country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	
	
}
