/**
 * 
 */
package com.game.strings;

/**
 * @author bittu
 *
 */
public class SwitchInStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		stringSwitch("one");
		stringSwitch("three");
		stringSwitch("five");
//		stringSwitch(null);  		//always have the null check to avoid null pointer exception
	}
	public static void stringSwitch(String str){
		switch(str){
		case "one": System.out.println("It is one");
					break;
		case "two": System.out.println("It is two");
					break;
		case "three": System.out.println("It is three");
					break;
		default: System.out.println("Not appropriate value");
					break;
		}
	}
}
