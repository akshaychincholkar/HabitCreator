package com.game.Interfaces;
abstract class ClassInterface{
	public static int variable = 2;
	public abstract void method();
}
public class ClassAsInterface extends ClassInterface{

	public static void main(String[] args) {
		//Cannot instantiate the type ClassInterface
//		ClassInterface obj1 = new ClassInterface();
		ClassAsInterface obj2 = new ClassAsInterface();
		obj2.method();
	}

	@Override
	public void method() {
		System.out.println("overided method() ");
		
	}

}
