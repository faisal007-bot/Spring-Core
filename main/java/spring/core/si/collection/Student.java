package spring.core.si.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private List<String> friends;
	private Set<Integer> rollnumber;
	private Map<Integer,String> record;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<Integer> getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(Set<Integer> rollnumber) {
		this.rollnumber = rollnumber;
	}
	public Map<Integer, String> getRecord() {
		return record;
	}
	public void setRecord(Map<Integer, String> record) {
		this.record = record;
	}
	@Override
	public String toString() {
		return "Student [friends=" + friends + ", rollnumber=" + rollnumber + ", record=" + record + "]";
	}
	
}
