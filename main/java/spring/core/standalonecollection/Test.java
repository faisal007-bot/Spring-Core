package spring.core.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List<String> list;
	private Set<String> set;
	private Map<Integer,String> map;
	
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
	@Override
	public String toString() {
		return "Test [list=" + list + ", set=" + set + ", map=" + map + "]";
	}
	public Test(List<String> list, Set<String> set, Map<Integer, String> map) {
		super();
		this.list = list;
		this.set = set;
		this.map = map;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
