/**
 * 
 */
package com.game.strings;

/**
 * @author bittu
 *
 */
public class RemoveAllChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(removeAllChars("bittu", 't'));
	}
	public static String removeAllChars(String str, char c){
		if(str == null){
			return null;
		}
		return str.replaceAll(new Character(c).toString(),"");
	}
}
