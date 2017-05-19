package com.game.strings;

public class StringPool {
	public static void main(String[] args) {
		String s1 = "bittu";
		String s2 = "bittu";
		if(s1 == s2){
			System.out.println("equal");
		}else{
			System.out.println("not equal");
		}
		String s3 = new String("bittu");
		String s4 = new String("bittu");
//		s3 = s3.intern();
//		s4 = s4.intern();
		if(s3 == s4){
			System.out.println("equal");
		}else{
			System.out.println("not equal");
		}
	}
}
