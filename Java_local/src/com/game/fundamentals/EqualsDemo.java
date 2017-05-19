package com.game.fundamentals;

public class EqualsDemo {

	private int value;
	public EqualsDemo(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof EqualsDemo){
			EqualsDemo object= (EqualsDemo) obj;	
			if(value == object.value) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		EqualsDemo one = new EqualsDemo(8);
		EqualsDemo two = new EqualsDemo(8);

//		System.out.println(one);
//		System.out.println(two);
		if(one.equals(two))System.out.println("Equals objects");
		else System.out.println("Not equal objects");
	}

}
