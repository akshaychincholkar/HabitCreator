package com.game.fundamentals;

public class Pyramid {

	public static void main(String[] args) {
		int spaceLength = 10;
		int manager = spaceLength - 1;
		for(int i=0;i<spaceLength;i++){
//			System.out.print(i);
			for(int j = manager; j>0; j--)System.out.print(" ");
			for(int k = 0;k < spaceLength-manager; k++)System.out.print("*");
			System.out.println();
			manager--;
		}
	}

}
