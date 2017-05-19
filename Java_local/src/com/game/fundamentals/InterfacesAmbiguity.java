package com.game.fundamentals;
interface I1{
	int b=5; // change this field name to a to generate ambiguity
//	public void method1();
}
interface I2{
	int a = 10;
}
public class InterfacesAmbiguity implements I1,I2{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Interfaces with multiple inheritance having same data member but different values:"+a);

	}

}
