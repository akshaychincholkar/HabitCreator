package com.game.collections;

import java.util.HashMap;

class StudentContract{
	private int rollNo;
	private String name;
	static public int value;
	public StudentContract(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() method");
		StudentContract instance = (StudentContract) obj;
		if(this.getName().equalsIgnoreCase(instance.getName())){
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode() mehod");
		return rollNo;
	}
}
public class EqualsContract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<StudentContract, String> map = new HashMap<>();
		StudentContract s1 = new StudentContract(21);
		StudentContract s2 = new StudentContract(21);
		s1.setName("b2");
		s2.setName("sur");
		System.out.println("s1 name:"+s1.getName());
		map.put(s1, "s1");
		map.put(s2, "s2");
		System.out.println("static value: "+s1.value);
		System.out.println(" Map size: "+map.size());
		
	}

}
