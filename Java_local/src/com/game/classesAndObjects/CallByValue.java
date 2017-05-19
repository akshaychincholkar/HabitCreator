package com.game.classesAndObjects;

public class CallByValue {

	static int a = 1;
	public static void main(String[] args) {
		System.out.println(" Main a: "+a);
		method(a);
		System.out.println(" After method a: "+a);

	}
	private static void method(int b) {
		b = 2;
		System.out.println(" method: "+b);
		
	}

}
