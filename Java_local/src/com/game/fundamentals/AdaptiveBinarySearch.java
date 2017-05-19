package com.game.fundamentals;

public class AdaptiveBinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int a[] = {3,4,5,1,2};
		int a[] = {1,2,3,4,5};
		binarySearch(a,3);
		

	}
	private static void binarySearch(int[] a, int value) {
		int lower = 0;
		int upper = a.length;
		for(int i =0 ; i<a.length; i++){

			int mid = (int) Math.floor(((lower+upper)/2));
			
			if(a[mid] == value){
				System.out.println("Found at location:"+mid);
				return;
			}
			if(value < a[mid])upper = mid;
			if(value > a[mid])lower = mid;

		}
		System.out.println("Not found");
	}


}
