package com.game.fundamentals;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Emp{
	
}
public class HackerEarth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Double> test = new HashMap<String, Double>();
		test.put("m", new Double(20));
		test.put("m", new Double(40));
		int count = 0;
		System.out.println("get: "+ test.get("m"));
		
		for(int i = 0;i < test.size(); i++ ){
			if(test.get("m")!=null){
				System.out.println(test.get("m"));
				test.get("m");
				test.remove("m");
			}
		}
		Map<Emp,String> test2 = new TreeMap<Emp,String>();
		
	}

}
