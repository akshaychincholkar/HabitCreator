package com.game.strings;

public class ConstructorCompare {
	public static void main(String[] args) {
		String s1 = "bittu";
		String s2 = new String("bittu");
		if(s1 == s2){
			System.out.println("Equal");
		}else{
			System.out.println("Not equal");
		}
		s1 = s2;
		System.out.println(s1);
	}
}
