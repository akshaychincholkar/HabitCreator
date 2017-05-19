package com.game.inheritance;
class ParentThis{
	int getData(){
		System.out.println("Parent");
		return 0;
	}
}
class ChildThis extends ParentThis{
	int getData(){
		System.out.println("Child");
		return 0;
		
	}
}
public class ReturnType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChildThis c1 = new ChildThis();
		c1.getData();
//		c1.getDate();
	}

}
