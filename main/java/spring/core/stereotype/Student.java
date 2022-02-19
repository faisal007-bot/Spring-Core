package spring.core.stereotype;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component //--> the name of the bean will be the name of the class but in camelcase.
@Component("st") //--> name of the class will be st because we explicitly provided the name
public class Student{
//	value annotation is used to set the value of the data member directly
	@Value("45")
	private int id;
	@Value("faisal khan")
	private String name;
//	value annotation to set the data members of the collection type
//	we need to use spring expression language to set the value using value annotation for collection type data members
//	syntax #{name of the bean id}
	@Value("#{l}")
	private List<String> list;
	@Value("#{s}")
	private Set<String> set;
	@Value("#{m}")
	private Map<Integer,String> map;
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
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public Student(int id, String name, List<String> list, Set<String> set, Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		this.set = set;
		this.map = map;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", list=" + list + ", set=" + set + ", map=" + map + "]";
	}
	
	
}