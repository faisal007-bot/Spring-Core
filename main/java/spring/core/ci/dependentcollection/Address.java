package spring.core.ci.dependentcollection;

public class Address {
	private String city;
	private String country;
	
	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	
	
}
