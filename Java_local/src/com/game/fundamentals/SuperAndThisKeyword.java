package com.game.fundamentals;
class SuperClass{
	public SuperClass() {
	System.out.println("Superclass constructor");
	}
}
class SubClass extends SuperClass{
	//constructors cannot be overrided
//	public SuperClass{}
	public SubClass() {
	this(1);
	System.out.println("No arg constructor of sub class");
	}
	public SubClass(int a){
		super();
		System.out.println("int-arg constructor of the subclass ");
	}
}
public class SuperAndThisKeyword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SubClass();

	}

}
