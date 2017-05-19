package com.game.strings;

import java.util.Arrays;

public class StringToBytesVV {
	public static void main(String[] args) {
		String s1 = "bittu";
		byte[] string = s1.getBytes();
		System.out.println("Bytes conversion: "+string);
		
		//lets convert from the byte to the string
		System.out.println("String from bytes : "+new String(string));
		
	      String str = "www.journaldev.com";
	        //convert String to byte array
	        byte[] byteArr = str.getBytes();
	        System.out.println("String to byte array : "+Arrays.toString(byteArr));
	        //convert byte array to String
	        String str1 = new String(byteArr);
	        System.out.println("byte array to String : "+str1);
	        //let's see if str and str1 are equals or not
	        System.out.println("str == str1? " + (str == str1));
	        System.out.println("str.equals(str1)? " + (str.equals(str1)));
	}
}
