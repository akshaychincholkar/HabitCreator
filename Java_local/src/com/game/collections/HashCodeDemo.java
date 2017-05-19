package com.game.collections;

import java.util.HashMap;

class StudentHashCode{
	private String name;
	private int rollNo;
	public StudentHashCode(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
//		System.out.println("Object:"+obj.getClass()+ " name: "+name.getClass());
		if(obj.equals(name)){
			System.out.println("equals(): obj is equal");
			return true;
		}
		System.out.println("equals(): obj is not equal");
		return false;
	}
//	@Override
//	public int hashCode() {
//		System.out.println("inside hashCode()"+name.hashCode());
//		return name.hashCode();
//	}
}
public class HashCodeDemo {

	public static void main(String[] args) {
		StudentHashCode s1 = new StudentHashCode("baby");
		StudentHashCode s2 = new StudentHashCode("baby");
		System.out.println("HashCode s1 : "+s1.hashCode()+ " s2: "+s2.hashCode());
//		if(s1.hashCode()== s2.hashCode()){
//			System.out.println("students are equal");
//		}else{
//			System.out.println("students are not equal");
//		}
//		if(s1.equals(s2)){
//			System.out.println("equal via equals()");
//		}else{
//			System.out.println("not equal via equals()");
//		}
		HashMap<StudentHashCode, String> map = new HashMap<>();
		map.put(s1, "s1");
		map.put(s2, "s2");
		
		System.out.println("Size of map:"+map.size());
	}

}
