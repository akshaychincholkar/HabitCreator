/**
 * 
 */
package com.game.strings;

/**
 * @author bittu
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(isPalindrome("aba")){
			System.out.println("Palindrome string");
		}else{
			System.out.println("Non-palindrome string");
		}
	}
	public static boolean isPalindrome(String str){
		StringBuffer sb = new StringBuffer(str);
		if(sb.reverse().toString().equals(str)){
			return true;
		}
		return false;
	}
}
