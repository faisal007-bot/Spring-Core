package spring.core.ci.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private List<String> names;
	private Set<Integer> numbers;
	private Map<Integer,String> records;
	
	public Student(List<String> names, Set<Integer> numbers, Map<Integer, String> records) {
		super();
		this.names = names;
		this.numbers = numbers;
		this.records = records;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [names=" + names + ", numbers=" + numbers + ", records=" + records + "]";
	}
	
}
