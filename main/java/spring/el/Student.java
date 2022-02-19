package spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
//	using arithmetic operators
//	@Value("#{10+10}")
//	@Value("#{13-10}")
//	@Value("#{10*10}")
//	@Value("#{10/10}")
//	@Value("#{10%10}")
	
//	using ternary operators
//	@Value("#{(10==20)?100:200}")
	private int id;
//	accessing static method
//	@Value("#{T(java.lang.Math).sqrt(25)}")
	
//	accessing static variable
//	@Value("#{T(java.lang.Math).PI}")
	private double number;
//	using ternary operators
//	@Value("#{(10==10)?'true':'false'}")
	
//	creating object using el
	@Value("#{new java.lang.String('deadeye')}")
	private String name;
//	using relational or comparison operators
//	@Value("#{10==10}")
//	@Value("#{10!=10}")
//	@Value("#{10>10}")
//	@Value("#{10<10}")
//	@Value("#{10<=10}")
//	@Value("#{10>=10}")
	
//	using logical operators
//	@Value("#{10>2&&10<7}")
//	@Value("#{10>2||10<7}")
//	@Value("#{!(10>2&&10<7)}")
	private boolean isValid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", number=" + number + ", name=" + name + ", isValid=" + isValid + "]";
	}
	public Student(int id, double number, String name, boolean isValid) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.isValid = isValid;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
