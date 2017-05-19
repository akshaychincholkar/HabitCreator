package com.game.fundamentals;

public class StringManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0 ; i<5;i++){
//			for(int j=4-i; j>0; j--){
//				System.out.print(" ");
//			}
			for(int k=i+1; k<5;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0 ; i<5;i++){
			for(int j=4-i; j>0; j--){
				System.out.print(" ");
			}
			for(int k=4-i; k<5;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

