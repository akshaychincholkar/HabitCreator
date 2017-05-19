package com.game.Interfaces;
interface Interface1{
	int var1 = 1;
	public void method();
}
interface Interface2{
//	int var1 = 3;
	public void method();
}
public class multipleInheritance implements Interface1,Interface2{

	public static void main(String[] args) {
		new multipleInheritance().method();
		System.out.println(new multipleInheritance().var1);
	}

	public void method() {
		System.out.println(" Method implementation");
	}

}
