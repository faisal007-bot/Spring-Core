package spring.core.si.dependentcollection;

public class PhoneNumber {
	private long number;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "PhoneNumber [number=" + number + "]";
	}
	
}
