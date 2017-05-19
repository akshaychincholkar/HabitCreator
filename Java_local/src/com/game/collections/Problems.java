package com.game.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Sort implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2){
		return o1.compareTo(o2);
	}
}
//class Employee{
//	String name;
//	public Employee() {	}
//	public Employee(String name){
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "name:"+name;
//	}
//	static class ComparatorName implements Comparator<String>{
//		public int compare(Employee o1, Employee o2){
//			return o1.name.compareTo(o2.name);
//		}
//	}
//}
public class Problems {

	public static void main(String[] args) {
		//Problem 1
//		Integer array[] = {2,3,1};
//		Arrays.sort(array,new Sort());
//		
//		for(Integer i:array){
//			System.out.println(" "+i);
//		}
//		
		//Problem 2: 
		
//		Set set = new TreeSet();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		
//		Iterator iter = set.iterator();
//		while(iter.hasNext()){
//			int next = (Integer) iter.next();
//			System.out.println(next);
//			if(next == 2) {
//				iter.remove();
//			}
//		}
//		iter = set.iterator();
//		while(iter.hasNext()){
//			System.out.println(iter.next());
		}
		//Problem 3: uncomment Employee class
	}


