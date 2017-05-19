package com.game.fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class  TV {
	int size;
	String name;
	public TV(String tv, int tvSize) {
		size = tvSize;
		name = tv;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
class TVComparison implements Comparator<TV>{

	public int compare(TV tv1, TV tv2) {
		
		return tv1.getSize() - tv2.getSize();
//		return 0;
	}	
}
public class ComparatorDemo {
	public static void main(String[] args) {
		TV tv1 = new TV("Sony",55);
		TV tv2 = new TV("Samsung",52);
		
		ArrayList<TV> tvs = new ArrayList<TV>();
		System.out.println("TV1 class:"+tv1.getClass());
		tvs.add(tv1);
		tvs.add(tv2);
		System.out.println("Before sorting");
		for(TV localTv: tvs){
			System.out.println(localTv.name+": "+localTv.size);
		}
		Collections.sort(tvs, new TVComparison());
		System.out.println("After sort");
		for(TV localTv: tvs){
			System.out.println(localTv.name+": "+localTv.size);
		}
	}

}
