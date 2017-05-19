package com.game.fundamentals;

public class ToStringDemo {
	private int value;
	public ToStringDemo(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "I am an object of ToSTringDemo";
	}
	public static void main(String[] args) {
		ToStringDemo object = new ToStringDemo(8);
		System.out.println(object);

	}

}
