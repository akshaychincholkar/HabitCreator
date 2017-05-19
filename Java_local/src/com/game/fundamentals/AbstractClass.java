package com.game.fundamentals;
abstract class Class1{
	int a=10;
	void method1(){
		System.out.println("Abstract class method");
	}
}
class InheritedClass extends Class1{
	int a = 6;
	void method1(){
		System.out.println(" Inherited class method");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		InheritedClass instance = new InheritedClass();
		System.out.println(" Value of a:"+instance.a);
		instance.method1();
//		System.out.println(" Method called: "+instance.method1());
	}

}
