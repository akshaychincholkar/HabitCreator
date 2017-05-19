package com.game.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

class Movie implements Comparable<Movie>{
	private String name;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	public Movie(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	@Override
	public int compareTo(Movie o) {
		return this.name.hashCode();
	}
}
public class CollectionDemo {
	public static void main(String[] args) throws Exception 
	{
		/**
		 * Collection's' is a class
		 * Whereas Collection is an interface
		 * Set, List, Queue
		 * 
		 *  Map
		 *  
		 */
		BufferedReader br=new BufferedReader(new FileReader("Movies.txt"));
		String content = null;
		String content1[];
		ArrayList<String> list=new ArrayList<String>();
		while((content = br.readLine())!= null)
		{
			System.out.println(content);
			content1=content.split("/");
			list.add(content1[0]);
			
		}
		
		//[pk,Raes,..,RHTDM]
	ListIterator i=list.listIterator();
	while(i.hasNext())
	{
		Object o=i.next();
		Object o1=i.hasNext();
	
		System.out.print("["+o+","+o1+" ...,");
	}
	
//	System.out.println("[");
//	for(String movie: list){
//		System.out.print(movie);
//		if()
//	}
	System.out.println();
	System.out.print("[");
	for(int i1 = 0; i1< list.size();i1++){
		
		if(i1== list.size()-1){
			System.out.print(list.get(i1));
		}else{
			System.out.print(list.get(i1)+",");
		}
	}
	System.out.println("]");
	Collections.sort(list);
	System.out.println();
	System.out.print("[");
	for(int i1 = 0; i1< list.size();i1++){
		
		if(i1== list.size()-1){
			System.out.print(list.get(i1));
		}else{
			System.out.print(list.get(i1)+",");
		}
	}
	System.out.println("]");
	
	ArrayList<Movie> movieList  = new ArrayList<>();
	br=new BufferedReader(new FileReader("Movies.txt"));
	while((content = br.readLine())!= null)
	{
		System.out.println(content);
		content1=content.split("/");
		movieList.add(new Movie(content1[0]));
		
	}
	Collections.sort(movieList);
	System.out.println();
	System.out.print("[");
	for(int i1 = 0; i1< movieList.size();i1++){
		
		if(i1== movieList.size()-1){
			System.out.print(movieList.get(i1));
		}else{
			System.out.print(movieList.get(i1)+",");
		}
	}
	System.out.println("]");
//		String s1 = "baby";
//		s1="b2";
//		System.out.println("s1: "+s1);
	}

}
