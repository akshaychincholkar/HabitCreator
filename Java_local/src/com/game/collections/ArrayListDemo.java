package com.game.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student(1,"Akshay");
		Student s2 = new Student(2,"Pawan");
		Student s3 = new Student(3,"Surbhi");
		Student s4 = new Student(4,"Neha");
		Student s5 = new Student(5,"Anshu");
		//adding values to the list
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s3);
		list.add(s4);
		list.add(s2);
		list.add(s5);
		
		//Five ways to iterate
		//1. for loop
		System.out.println("using for loop");
		for(int i=0; i< list.size();i++){
			System.out.println(list.get(i));
		}
		//2. for while loop
		System.out.println("*******************************\nusing while loop");
		int i = 0;
		while(i<list.size()){
			System.out.println(list.get(i));
			i++;
		}
		
		System.out.println("******************************\n For each loop");
		for(Student temp: list){
			System.out.println(temp);
		}
		Iterator iter = list.iterator();
		System.out.println("********************************\nUsing iterator");
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		System.out.println("*********************************\nUsing collection streams");
//		Student temp;
//		list.forEach((temp)-> {System.out.println(temp);	});
//		}
	}

}
