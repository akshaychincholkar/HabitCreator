package com.game.reflection;
class Person{
	private String name;
	private int id;
	public Person() {
		System.out.println("Person constructor");
	}
	public Person(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
public class ClassClassMethods {
	class Local{}

	public static void main(String[] args) throws Exception{
		
		Class classObj = Class.forName("com.game.reflection.Person");
		Person person = (Person) classObj.newInstance();
		System.out.println(classObj.getName());
		System.out.println("isInterface():"+classObj.isInterface());
		System.out.println("isLocalClass():"+classObj.isLocalClass());
//		System.out.println(""+classObj.is);
/*		Class localClass = Class.forName("com.game.reflection.ClassClassMethods.Local");
		System.out.println("local class: "+localClass.getName());
		System.out.println("IsLocalClass(): "+localClass.isLocalClass());*/
		
	}

}
