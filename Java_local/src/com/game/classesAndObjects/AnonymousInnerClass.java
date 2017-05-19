package com.game.classesAndObjects;
class OuterClass{
	public void method(){
	System.out.println(" Outer class implementation");
	}
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		OuterClass obj = new OuterClass(){
			 public void method(){
				System.out.println("Anonymous inner class implementation");
			}
		};
		obj.method();
		new OuterClass(){
			public void method(){
				System.out.println("Anonymous inner class - 2 implementation");
			}
		}.method();
	}

}
