package com.game.fundamentals;

import java.util.ArrayList;
import java.util.Collections;

class HDTV implements Comparable<HDTV>{
	int size;
	String name;
	public HDTV(String tv, int tvSize) {
		size = tvSize;
		name = tv;
	}
	public int compareTo(HDTV formal) {
		
		return size - formal.size;
	}
	
}
public class ComparableDemo {

	public static void main(String[] args) {
		HDTV tv1 = new HDTV("Sony", 52);
		HDTV tv2 = new HDTV("Sampsung",55);
		ArrayList<HDTV> tvs = new ArrayList<HDTV>();
		tvs.add(tv2);
		tvs.add(tv1);
		System.out.println("Before sort:");
		for(HDTV localTv: tvs){
			System.out.println(localTv.name+": "+localTv.size);
		}
		System.out.println("After sort");
		Collections.sort(tvs);
		for(HDTV localTv: tvs){
			System.out.println(localTv.name+": "+localTv.size);
		}

	}

}
