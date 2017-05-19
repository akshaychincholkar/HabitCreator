package com.game.inheritance;

import java.io.FileNotFoundException;

class Parent{
	public int method1() throws Exception{
		System.out.println("Parent method");
		throw new Exception();
		
	}
}
class Child extends Parent{
	public int method1()throws FileNotFoundException{
		System.out.println("Child method ");
		throw new FileNotFoundException();
	}
	
}
public class PrototypeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Parent p = new Parent();
//		Parent p = new Child();
		Child p = new Child();
//		Child p = (Child) new Parent(); //class cast exception
		
		try {
			p.method1();
		} catch (Error e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
