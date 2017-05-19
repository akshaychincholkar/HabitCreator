package com.game.inheritance;
class SuperClass{
	public SuperClass() {
		System.out.println("Super class constructor");
	}
}
class SubClass extends SuperClass{
	 public SubClass() {
		 System.out.println("Subclass constructor");
	}
	 public SubClass(int a){
		 this();
		 System.out.println("test");
		 }
	 }

public class SuperClassConstructor {
	public static void main(String[] args) {
		new SubClass(1);
	}

}
