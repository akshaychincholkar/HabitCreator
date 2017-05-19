package com.game.collections;

public class EqualsDemo {
	private int value;
	public EqualsDemo(int value) {
		this.value = value;
	}
//@Override
//	public boolean equals(Object obj) {
//	EqualsDemo object = (EqualsDemo) obj;
//	if(this.value == object.value)	
//	return true;
//	else return false;
//	}
	public static void main(String[] args) {
		EqualsDemo one = new EqualsDemo(8);
		EqualsDemo two = new EqualsDemo(8);
		if(one.equals(two))System.out.println("Equal");
		else System.out.println("Not equal");
	}

}
